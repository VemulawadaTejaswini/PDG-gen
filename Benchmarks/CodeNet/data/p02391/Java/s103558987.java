import java.util.*;
public class Main{
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n=sc.nextInt();
    	int m=sc.nextInt();
    	String s;
    	if(n>m){
    		s=">";
    	}else if(n<m){
    		s="<";
    	}else{
    		s="==";
    	}
    	
    	System.out.println("a "+s+" b");
    }
}

