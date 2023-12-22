import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();

        
        int n=1;
        for(int i =1; i<=20; i++) {
            if( (2*D+1)*i >= N) {
                n = i;
                break;
            }
        }
        
        System.out.println( n);
    }
}
