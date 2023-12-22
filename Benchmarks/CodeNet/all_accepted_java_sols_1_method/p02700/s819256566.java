import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();
        int i = 1;
        while (true){
            if(i%2==1){
                C -= B;
                if(C <= 0){
                    System.out.print("Yes");
                    break;
                }

            }
            else{
                A -= D;
                if(A <= 0){
                    System.out.print("No");
                    break;
                }

            }
            i++;
        }

    }

}
