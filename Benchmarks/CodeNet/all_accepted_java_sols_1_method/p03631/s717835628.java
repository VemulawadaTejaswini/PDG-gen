import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	int f = n / 100;
	int l = n % 10;

	if(f == l){
	    System.out.println("Yes");
	}else{
	    System.out.println("No");
	}
    }
}
