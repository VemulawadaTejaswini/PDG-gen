import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String n = sc.next();
        String nn[] = n.split("");
        int i,j;
        long mozi = Integer.parseInt(nn[0]);
        long ans = 0;
        long check = 0;
        String nisin;
        String count[] = new String[n.length()];
        Arrays.fill(count,"0");
        int loop = (int) Math.pow(2, n.length() - 1);
		
        for(i = 0; i < loop;i++){
          nisin = Integer.toBinaryString(i);
          for(j = nisin.length();j < n.length() - 1; j++){
            nisin = "0" + nisin;
          }
          count = nisin.split("");
          check = 0;
          mozi = Integer.parseInt(nn[0]);
          for(j = 1;j <n.length(); j++){
            if(count[j - 1].equals("0")){
              mozi = mozi * 10;
              mozi += Integer.parseInt(nn[j]);
            }else{
              check += mozi;
              mozi = Integer.parseInt(nn[j]);
            }
          }
          ans += mozi + check;
        }
      	  
          System.out.println(ans);
      
    }
}