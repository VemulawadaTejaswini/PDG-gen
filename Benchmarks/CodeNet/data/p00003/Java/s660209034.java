import java.util.*;
 
public class Main {
    public static void main(String args[] ) throws Exception {
    	
        Scanner sc = new Scanner(System.in);
        String M = sc.nextLine();
        int N = Integer.parseInt(M);
    	
        for (int i=0; i<N; i++) {
        	String[] array = sc.nextLine().split(" ");

            int a = Integer.parseInt(array[0]);
            int b = Integer.parseInt(array[1]);
            int c = Integer.parseInt(array[2]);
            
            int max = a;
            
          for (int j=1; j<3; j++) {
        	int v = Integer.parseInt(array[j]);
            if (v > max) {
                max = v;
            }
          }
            
            if((b*b + c*c) == max*max){
            	System.out.println("YES");
            }else{
            	System.out.println("NO");
            }
        }
    }
}