import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	long[] r = new long[n+1];
	r[0] = 2;
	r[1] = 1;

	for(int i = 2; i < n+1; i++){
	    r[i] = r[i-1]+r[i-2];
	}

	System.out.println(r[n]);
    }
}
