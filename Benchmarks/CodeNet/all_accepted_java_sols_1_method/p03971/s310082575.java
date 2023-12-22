import java.util.*;
public class Main {
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int N = Integer.parseInt(scan.next());
	int A = Integer.parseInt(scan.next());
	int B = Integer.parseInt(scan.next());
	String s = scan.next();
	for(int i=0;i<N;i++){
	    if(((A+B)==0)||(s.charAt(i)=='c'))
		System.out.println("No");
	    else if((s.charAt(i)=='a')&&((A+B)!=0)){
		if(A>0){
		    A--;
		    System.out.println("Yes");
		}
		else{
		    B--;
		    System.out.println("Yes");
		}
	    }
	    else if((s.charAt(i)=='b')&&(B!=0)){
		 B--;
		 System.out.println("Yes");
	    }
	    else
		System.out.println("No");
	}
    }
}