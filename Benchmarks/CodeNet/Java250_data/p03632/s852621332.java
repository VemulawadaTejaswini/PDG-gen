
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {

    String Name;
    int SV;
    int EV;
    boolean T;

    Main(String Name, int SV, int EV, boolean T) {
        this.Name = Name;
        this.SV = SV;
        this.EV = EV;
        this.T = T;
    }

    public static void main(String[] args) throws IOException {
        Scanner Input = new Scanner(System.in);
        int A = Input.nextInt();
        int B = Input.nextInt();
        Main B1 = new Main("B1", A, B, false);
        int C = Input.nextInt();
        int D = Input.nextInt();
        Main B2 = new Main("B2", C, D, false);
        int Count = 0;
        for (int I = 0; I <= 100; I++) {
            if (I == B1.SV) {
                B1.T = true;
            }
            if (I == B2.SV) {
                B2.T = true;
            }
            if (I == B1.EV) {
                B1.T = false;
            }
            if (I == B2.EV) {
                B2.T = false;
            }
            if(B1.T && B2.T){
            Count++;}
        }
        System.out.println(Count);

    }
}
