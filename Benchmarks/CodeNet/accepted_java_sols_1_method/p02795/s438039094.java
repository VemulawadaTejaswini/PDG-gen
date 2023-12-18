import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int H = sc.nextInt();
	int W = sc.nextInt();
	int N = sc.nextInt();
	int count=0;
        while(N > 0){
	    if(H < W){
		N -= W;
	    }else{
		N -= H;
	    }
	    count++;
	}
	System.out.print(count);
    }
}
