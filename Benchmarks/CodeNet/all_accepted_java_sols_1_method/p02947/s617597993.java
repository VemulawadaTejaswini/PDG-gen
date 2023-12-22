import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      char[][] c = new char[n][];
      long cnt = 0;
      HashMap<String,Integer> map = new HashMap<String,Integer>();
      String s = "";
      for(int i = 0;i < n;i++){
      	c[i] = sc.next().toCharArray();
        Arrays.sort(c[i]);
        for(int j= 0;j < 10;j++)s += c[i][j];
        if(map.get(s)==null){
        	map.put(s,1);
        }else{
          int k = map.get(s);
          map.put(s,k+1);
        }
        s = "";
      }
      for(int a:map.values()){
      	cnt += (long)a*(a-1)/2;
      }
      System.out.println(cnt);
    }
}
