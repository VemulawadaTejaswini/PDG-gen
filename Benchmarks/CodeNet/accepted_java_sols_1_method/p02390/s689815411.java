import java.util.*;
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n=sc.nextInt();
    	int a=n%60;
    	n/=60;
    	int b=n%60;
    	n/=60;
    	
    	
    	System.out.println(n+":"+b+":"+a);
    }
}

