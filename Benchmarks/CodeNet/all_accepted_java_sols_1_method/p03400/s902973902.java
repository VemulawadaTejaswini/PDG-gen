import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        int X = sc.nextInt();
        int A;
        int date = 0;
        int[] count = new int[N];
        for(int i=0; i<N; i++){
        	A = sc.nextInt();
        	count[i] = 1;
        	date = A + 1;
        	while(date <= D){
        		count[i]++;
        		date += A;
        	}
        }
        
        int c = 0;
        for(int i=0; i<N; i++){
        	c += count[i];
        }
        System.out.println(c+X);
	}

}
