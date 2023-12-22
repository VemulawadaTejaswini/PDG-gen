import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {

        Scanner sc = new Scanner(System.in);
        String M = sc.nextLine();
        int N = Integer.parseInt(M);
        

        for (int i=0; i<N; i++) {
        	String[] array = sc.nextLine().split(" ");
        	List<Integer> triangle = new ArrayList<Integer>();

            triangle.add(Integer.parseInt(array[0]));
            triangle.add(Integer.parseInt(array[1]));
            triangle.add(Integer.parseInt(array[2]));
            
            Collections.sort(triangle);
            
            int A = (int)triangle.get(0);
            int B = (int)triangle.get(1);
            int C = (int)triangle.get(2);
           
            if((B*B + A*A) == C*C){
            	System.out.println("YES");
            }else{
            	System.out.println("NO");
            }
        }
    }
}