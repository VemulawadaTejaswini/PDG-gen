import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner stdin = new Scanner(System.in);
        int x = stdin.nextInt();
	int y  = stdin.nextInt();
	if(x<y){
	    System.out.println("a < b");
	}
	else if(x>y){
	    System.out.println("a > b");
	}
	else{
	    System.out.print("a == b");
	};
    }
}