import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    int N = scanner.nextInt();
	    
	    int V [] = new int [N];
        for(int i = 0; i < N; i++)
        	V [i] = scanner.nextInt();
        
        int C [] = new int [N];
        for(int i = 0; i < N; i++)
        	C [i] = scanner.nextInt();
       
        int price = 0;
        for(int i = 0; i < N; i++){
        	if (V[i]>C[i]){
        		price = price + V[i]-C[i];
        	}
        }
        System.out.print(price);

	}

}
