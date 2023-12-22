import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int count = 1;
        int flag = 0;   

        int Kbai = K;

        while (Kbai <= B) {
            if(Kbai >= A && Kbai <= B){
                flag = 1;
                break;
            }
            count += 1;
            Kbai = K*count;
        }

        if(flag == 1){
            System.out.println("OK");
        }else{
            System.out.println("NG");
        }
    }
}