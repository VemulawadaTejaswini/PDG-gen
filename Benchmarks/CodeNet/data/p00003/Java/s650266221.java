import java.util.*;
 
public class Main {
    public static void main(String args[] ) throws Exception {
    	
        Scanner sc = new Scanner(System.in);
        String M = sc.nextLine();
        int N = Integer.parseInt(M);
    	
        for (int i=0; i<N; i++) {
        	String[] array = sc.nextLine().split(" ");
            Arrays.sort(array, Comparator.reverseOrder());

            int a = Integer.parseInt(array[0]);
            int b = Integer.parseInt(array[1]);
            int c = Integer.parseInt(array[2]);
            
            if(a*a == (b*b + c*c)){
            	System.out.println("YES");
            }else{
            	System.out.println("NO");
            }
        }
    }
}