import java.util.Scanner;
     
    public class Main {
      public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        int []a = new int[N];
        
        int migi = 0;
        int hidari = 0;
        for(int i=0; i<M; i++) {
        	 a[i] = sc.nextInt();
        	 	if(a[i]<X) {
        	 		hidari++;
        	 	}else {
        	 		migi++;
         	 }
        }
      System.out.println(Math.min(migi,hidari));
      }
    }