import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	    	   
    	while (true){ 
    		int[]a = new int[2];
    		a[0] = scan.nextInt();
        	a[1] = scan.nextInt();
    		if(a[0] == 0 && a[1] ==0){
    			break;
    		}else{
    			java.util.Arrays.sort(a);
    			System.out.println(a[0]+" "+a[1]);
    		}
    	}
   }
}