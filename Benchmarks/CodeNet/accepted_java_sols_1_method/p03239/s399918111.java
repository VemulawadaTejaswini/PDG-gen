import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
      int T = scn.nextInt();
      int y = 1000000;
      int[] a = new int[n*2];
      for(int i=0; i<a.length; ++i){
        a[i] = scn.nextInt();
      }
      for(int i=1; i<a.length; i+=2){
        if(T >= a[i]){
          if(y > a[(i-1)]){
          y = a[(i-1)];
          }
        }
      }
      if(y !=1000000){
        System.out.println(y);
      }else{
        System.out.println("TLE");
      }
	}
}
