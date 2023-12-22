import java.util.Scanner;
public class Main {
    public static void main (String args[]){
    	Scanner str =new Scanner(System.in);
        StringBuffer buf = new StringBuffer();
    	while(true){
    	    int a = str.nextInt();
    	    int b = str.nextInt();
    	    if(a==0&&b==0){
    	    	break;
    	    }
    	    if(a<b){
    	        buf.append(Integer.toString(a)).append(" ").append(Integer.toString(b)).append("\n");
    	    }
    	    if(a>b){
    	    	buf.append(Integer.toString(b)).append(" ").append(Integer.toString(a)).append("\n");
    	    }
    	    if(a==b){
    	    	buf.append(Integer.toString(b)).append(" ").append(Integer.toString(a)).append("\n");
    	    }

    	}
    	System.out.print(buf);
    }
}