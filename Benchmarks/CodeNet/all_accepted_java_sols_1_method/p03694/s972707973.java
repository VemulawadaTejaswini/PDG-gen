
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int N = Input.nextInt();
        int HoOo = 0;
        int Min = 1001;
        int Max = -1;
        for (int I = 0; I < N; I++) {
            int X = Input.nextInt();
            if (X > Max) {
                Max = X;
            }
            if (X < Min) {
                Min = X;
            }
        }
        System.out.println(Max - Min);
    }
}

//Learn Before You Earn
