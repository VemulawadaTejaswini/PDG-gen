import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int[] X = new int[N];
	for(int i=0;i<N;i++){
	    X[i] = sc.nextInt();
	}
	//Arrays.sort(X);
	int min = Integer.MAX_VALUE;
	for(int p=1; p<=100; p++){
	    int count = 0;
	    for(int j=0;j<N;j++){
		count += (X[j] - p)*(X[j] - p);
	    }
	    if(count < min) min = count;
	}
	System.out.print(min);
    }
}
