import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        if(A>B) {
        	int cE=C-(A-B);
        	if(cE<0) {
        		cE=0;
        	}
        	System.out.println(cE);
        }else {
        	System.out.println(C);
        }
        
        
        
    }
}