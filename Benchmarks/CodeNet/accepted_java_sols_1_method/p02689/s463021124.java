import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int M = sc.nextInt();
	int[] tenH = new int[N];
	for(int i=0;i<N;i++){
	    tenH[i] = sc.nextInt();
	}
	boolean[] good = new boolean[N];
	for(int i=0;i<N;i++) good[i] = true;
	
	for(int i=0;i<M;i++){
	    int A = sc.nextInt();
	    int B = sc.nextInt();
	    if(tenH[A-1] >= tenH[B-1]){
		good[B-1] = false;
	    }
	    if(tenH[A-1] <= tenH[B-1]){
		good[A-1] = false;
	    }
	}
	int count=0;
	for(int i=0;i<N;i++){
	    if(good[i]==true) count++;
	}
	System.out.print(count);
    }
}
