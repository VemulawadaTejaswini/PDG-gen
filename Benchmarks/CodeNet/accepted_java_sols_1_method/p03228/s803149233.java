import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
      	int k = scn.nextInt();
      	if(k%2==1){
          for(int i=1; i<=(k-1)/2; ++i){
            if(a%2==1){
              a = a - 1;
            }
            a = a/2;
            b = b + a;
            if(b%2==1){
              b = b - 1;
            }
            b = b/2;
            a = a + b;
          }
          if(a%2==1){
              a = a - 1;
            }
            a = a/2;
            b = b + a;
        }else{
          for(int i=1; i<=k/2; ++i){
            if(a%2==1){
              a = a - 1;
            }
            a = a/2;
            b = b + a;
            if(b%2==1){
              b = b - 1;
          	}
            b = b/2;
            a = a + b;
         }
        }
      System.out.print(a);
      System.out.print(" ");
      System.out.print(b);
	}
}
