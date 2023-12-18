import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int X = scan.nextInt();
        int Y = scan.nextInt();
        if (Y < X) {
            int temp1 = A;
            int temp2 = X;
            A = B;
            B = temp1;
            X = Y;
            Y = temp2;
        }
        int type1 = A*X + B*Y;// all seperate
        int type2 = C*X*2 + (Y-X) * B;
        int type3 = C*Y*2;
        int answer = Math.min(type1, type2);
        answer = Math.min(answer,type3);
        System.out.println(answer);
    }
}
