import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	long N = scan.nextLong();
	int F = -1;
	for(int i = 1; i <= Math.sqrt(N); i++){
	    if(N % i == 0){
		F = String.valueOf(N/i).length();
	    }
	}

	System.out.println(F);
    }
}
