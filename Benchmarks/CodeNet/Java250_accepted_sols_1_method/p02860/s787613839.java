import java.util.*;
 
public class Main {
    public static void main(String[] args)   {
        
    	Scanner sc= new Scanner(System.in);
    	int n=sc.nextInt();
    	sc.nextLine();
        String s = sc.nextLine();
        char[] c=new char[n];
        c=s.toCharArray();
    	char[] test=new char[n];
        
    	if(n%2==1||n!=s.length()) {
    		System.out.println("No");
    	}else{
    		for(int i=0;i<(n/2);i++){
    			test[i]=c[i];
    			test[n/2+i]=c[i];
    		}
    		String test_s=String.valueOf(test);
    		String c_s=String.valueOf(c);
    		if(test_s.equals(c_s)) {
    			System.out.println("Yes");
    		}else {
    			System.out.println("No");
    		}
    	}
    }
}