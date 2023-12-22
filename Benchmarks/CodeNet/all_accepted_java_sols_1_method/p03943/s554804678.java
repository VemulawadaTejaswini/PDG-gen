    import java.util.*;
    public class Main {
     
    	public static void main(String[] args) {
    		Scanner scan =new Scanner(System.in);
    		int[] array=new int[3];
    		array[0]=Integer.parseInt(scan.next());
    		array[1]=Integer.parseInt(scan.next());
    		array[2]=Integer.parseInt(scan.next());
    		Arrays.sort(array);
    		if(array[0]+array[1]==array[2]) {
    			System.out.print("Yes");
    		}else {
    			System.out.print("No");
    		}
    		
    }
     
    }