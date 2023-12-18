import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int max = 0, min = 1919810;
        int N = s.nextInt();
        for(int i = 0; i < N; i++){
            int ai = s.nextInt();
            if(ai > max)
                max = ai;
            if(ai < min)
                min = ai;
        }
        System.out.println(max - min);
    }
}
