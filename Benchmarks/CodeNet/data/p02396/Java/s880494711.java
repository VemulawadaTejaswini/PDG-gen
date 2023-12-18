import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException {
		
		
		BufferedInputStream bis=new BufferedInputStream(System.in);
		bis.skip(2);
		Scanner sc = new Scanner(bis);
		
		
	    int data;
	    for(int i =1;;i++){data=sc.nextInt();
	    
	      if(data!=0){
	    	System.out.println("Case "+i+": "+data);
	    }else{break;}}
	
		
	}
}