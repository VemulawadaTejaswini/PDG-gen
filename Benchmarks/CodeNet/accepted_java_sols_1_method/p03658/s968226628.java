
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws IOException {
        Scanner Input = new Scanner(System.in);
        int N = Input.nextInt();
        int K = Input.nextInt();
        ArrayList<Integer> Li = new ArrayList();
        for (int I = 0; I < N; I++) {
            Li.add(Input.nextInt());
        }
        Collections.sort(Li);
        long Sum = 0;
        for (int I = Li.size()-1; I >= Li.size()-K; I--) {
        Sum+=Li.get(I);
        }
        System.out.println(Sum);
    }

}
