import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int a = scan.nextInt();
	int b = scan.nextInt();
	int c = scan.nextInt();
	int d = scan.nextInt();

	int ab = Math.abs(a-b);
	int bc = Math.abs(b-c);
	int ca = Math.abs(c-a);

	if(ca <= d){
	    System.out.println("Yes");
	}else{
	    if(ab <= d && bc <= d){
		System.out.println("Yes");
	    }else{
		System.out.println("No");
	    }
	}
    }
}
	
