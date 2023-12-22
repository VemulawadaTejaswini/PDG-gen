import java.util.Scanner;

public class Main {
    static String a[];
    static String n;
    static String ans;

  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  n = sc.next();
	  a = new String[n.length()];
	  for(int i = 0; i < n.length(); i++) {
		  a[i] = n.substring(i, i+1);
	  }
	  if(dfs(0,a[0],Integer.parseInt(a[0]))){
		  System.out.println(ans+"=7");
	  }
      sc.close();
  }
  static public Boolean dfs(int i,String sum,int sum2) {
	//基本ケース　枝の最後の基本ケース
    if (i == n.length()-1) {
    		if (sum2 == 7) {
    			ans = sum;
    			return true;
    		}
    		return false;
    }

    //再帰ケース
    if(dfs(i + 1,sum + "+" + a[i+1],sum2 + Integer.parseInt(a[i+1]))) return true;
    if(dfs(i + 1,sum + "-" + a[i+1],sum2 - Integer.parseInt(a[i+1]))) return true;

    return false;
  }
}