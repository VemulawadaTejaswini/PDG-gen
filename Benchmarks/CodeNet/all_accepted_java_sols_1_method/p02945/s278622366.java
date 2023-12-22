import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final int A = scan.nextInt();
        final int B = scan.nextInt();
        int sum = A + B;
        int diff = A - B;
        int product = A * B;
        if(sum >= diff){
            if(product >= sum){
                System.out.println(product);
            }else{
                System.out.println(sum);
            }
        }else{
            if(product >= diff){
                System.out.println(product);
            }else{
                System.out.println(diff);
            }
        }

        scan.close();
    }
}