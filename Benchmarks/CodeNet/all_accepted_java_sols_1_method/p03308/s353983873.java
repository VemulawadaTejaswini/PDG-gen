import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int min = Integer.MAX_VALUE;
	int max = 0;
	int val = 0;
	for(int i=0;i<N;i++){
	    val = sc.nextInt();
	    if(val > max) max = val;
	    if(val < min) min = val;
	}
	System.out.print(max-min);
    }
}
