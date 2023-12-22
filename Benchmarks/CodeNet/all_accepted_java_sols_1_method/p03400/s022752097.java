import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int D = sc.nextInt();
    int X = sc.nextInt();
    int[]A= new int[N];
 
    int all = 0;
    for(int i=0; i<N; i++){
        A[i] = sc.nextInt();
        for(int j=0; j<D; j++) {
        	if(j*A[i]+1<=D) {
        		all++;
        	}
    } 
}
	System.out.println(all+X);
    }
}

