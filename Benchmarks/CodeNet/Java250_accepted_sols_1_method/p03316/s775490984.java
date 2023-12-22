import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
	int n = N;
	int count = 0;
	for(int i=0;i<Integer.toString(N).length();i++){
	    count += n%10;
	    n /= 10;
	}
        if(N%count==0) System.out.print("Yes");
	else System.out.print("No");
    }
}
