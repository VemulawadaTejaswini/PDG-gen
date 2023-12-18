import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        
        int white = N*M;
        int black = 0;
        
        for(int i=0; i<=N; i++){
            for(int j=0; j<=M; j++){
                black = N*j + M*i -2*j*i;
                if(black == K){
                    System.out.println("Yes");
                    return;
                }


            }
            
        }     
        
        
          System.out.println("No");
        }
    }