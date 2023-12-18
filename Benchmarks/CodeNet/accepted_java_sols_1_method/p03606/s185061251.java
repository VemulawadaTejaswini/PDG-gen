import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	int[] l = new int[n];
	int[] r = new int[n];
	for(int i = 0; i < n; i++){
	    l[i] = scan.nextInt();
	    r[i] = scan.nextInt();
	}

	int sum = 0;
	for(int i = 0; i < n; i++){
	    sum += r[i]-l[i]+1;
	}

	System.out.println(sum);
    }
}
