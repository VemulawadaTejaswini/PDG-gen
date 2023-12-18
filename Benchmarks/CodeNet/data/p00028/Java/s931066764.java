import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        int[] h = new int[100];

        while(s.hasNext()){
            h[s.nextInt()] += 1;
        }

        int max = 0;
        for (int i = 0; i < 100; i++) {
            if(h[i] > max) max = h[i];
        }

        for (int i = 0; i < 100; i++) {
            if(h[i] == max) System.out.println(i);
        }
    }
}