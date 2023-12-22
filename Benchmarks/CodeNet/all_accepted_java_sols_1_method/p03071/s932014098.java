import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int sum = 0;
        int x = 0;

        for (int y=0; y<2; y++){
            
            if(A<B){
                x = B;
                B = B-1;
                sum = sum + x;
            }
            else{
                x = A;
                A = A - 1;
                sum = sum + x;
            }
        }
            System.out.println(sum);
    }
}
