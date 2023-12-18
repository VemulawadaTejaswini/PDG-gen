import java.util.*;
public class Main {

public static int [] m ={500,100,50,10,5,1};

	    public static void main(String[] args) throws java.io.IOException{
	        Scanner scan = new Scanner(System.in);
	        int sum=0;
	        double total_s =0;
	        int n=0;
	        while(scan.hasNext()){
	        	String [] strs = scan.nextLine().split(",");
	        	sum+=Integer.parseInt(strs[0])*Integer.parseInt(strs[1]);
	        	total_s+=Integer.parseInt(strs[1]);
	        	n++;
	        }
	        System.out.println(sum);
	        System.out.println((int)(total_s/n+0.5));

	    
	}
}