    import java.util.*;
    public class Main {
     
    	public static void main(String[] args) {
    			
    		Scanner scan =new Scanner(System.in);
    		
    		int a1=Integer.parseInt(scan.next());
    		int a2=Integer.parseInt(scan.next());
    		int a3=Integer.parseInt(scan.next());
    		
    		int[] a= {a1,a2,a3};
    		Arrays.parallelSort(a);
    		
    		System.out.print(a[1]-a[0]+a[2]-a[1]);
     
    }
    }
// end 