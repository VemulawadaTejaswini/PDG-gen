import java.util.Scanner;
     
    public class Main {
      public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        int X = sc.nextInt();
        int []a = new int[N];
        
        int all = 0;
        for(int i=0; i<N; i++) {
        	 a[i] = sc.nextInt();
        	 for(int j=0; j<D; j++) {
        		 if(D>=j*a[i]+1) {
        			 all++;
        		 }
        	 }
        }
             System.out.println(all+X);
      }
    }