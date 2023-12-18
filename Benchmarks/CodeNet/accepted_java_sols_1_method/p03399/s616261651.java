import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int A = scan.nextInt();
	int B = scan.nextInt();
	int C = scan.nextInt();
	int D = scan.nextInt();

	int count = 0;
	if(A >= B){
	    count += B;
	}else{
	    count += A;
	}
	if(C >= D){
	    count += D;
	}else{
	    count += C;
	}

	System.out.println(count);
    }
}
