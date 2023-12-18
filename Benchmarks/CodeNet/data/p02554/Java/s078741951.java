import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        long N = sc.nextInt();
        long x;
        x=2*(N-1)*(N-2);
        
        for(int i=0;i<N-2;i++) {
        x=10*x;
        if(x>1000000007) {
        	x=x%1000000007;
        }
        }
        System.out.println(x);
        

    }
}