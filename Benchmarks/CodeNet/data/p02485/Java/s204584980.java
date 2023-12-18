import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	while(true){
	    int x = sc.nextInt();
	    if(x == 0){
		break;
	    }

	    int dig;
	    int sum = 0;

	    while(x != 0){
		dig = x % 10;
		sum += dig;
		x /= 10;
	    }

	    System.out.println(sum);
	}
    }
}