import java.util.Scanner;
public class Main {
    public static void main (String args[]){
    	Scanner str =new Scanner(System.in);
    	StringBuffer buf =new StringBuffer();
        int[] num={};
        int count =0;
        int sum =0;
    	    int a = str.nextInt();
    	    int b = str.nextInt();
    	    int c = str.nextInt();
    	    for (int i=1;i<= c;i++){
    	    	if(c%i==0){
    	    		if(a<=i&&i<=b){
    	    			sum++;
    	    		}
    	    	}
    	    }

    	System.out.println(sum);
    }
}