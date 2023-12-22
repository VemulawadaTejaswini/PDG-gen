import java.util.Scanner;

public class Main{
    public static void main(final String args[]) {
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        int A = scan.nextInt();
        int B = scan.nextInt();
        int Kc = K;
        while(true){
            if(Kc <= B){
                if(Kc >= A){
                    System.out.println("OK");
                    break;
                }
            }else if(Kc > B){
                System.out.println("NG");
                break;
            }
            Kc = Kc + K;
            
        }

    }
}