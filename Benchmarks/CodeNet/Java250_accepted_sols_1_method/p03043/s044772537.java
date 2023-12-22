import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      double n0 = (double) 1/n;
      double count = 0;
      int point = 0;
      double per = 0;
      for(int i = 1;i <= n;i++){
        point = i;
      	while(point < k){
        	count++;
            point = point*2;
        }
        per += n0*Math.pow(0.5,count);
        count = 0;
      }
      System.out.println(per);
    }
}