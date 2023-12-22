import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long K = scanner.nextLong();
        long ans = K;
 
        while(!(K == 0L)){
            if(!(A == 0L)){
                K = K - A;
                if(K >= 0L){
                    A = 0L;
                }else{
                    A = A - ans;
                    break;
                }
            }else{
                if(B >= K){
                    B = B - K;
                    K = 0L;
                }else{
                    B = 0L;
                    K = 0L;
                }
            }
        }
        System.out.print(A + " " + B);
	}
}