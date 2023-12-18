import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	String s = scan.next();

	int A = Integer.MAX_VALUE;
	int Z = Integer.MIN_VALUE;

	for(int i = 0; i < s.length(); i++){
	    if(s.charAt(i) == 'A' && i < A){
		A = i;
	    }
	    if(s.charAt(i) == 'Z' && i > Z){
		Z = i;
	    }
	}

	System.out.println(Z-A+1);
    }
}
