import java.util.Scanner;

public class Main {

    public Main() {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();

        String R = "";
        while(N > 0){
            char C = (char)(N%26L);
            if(C == 0) C = 26;
            N = (N - C) / 26L;
            C = (char)('a'+C-1);
            R = C + R;
        }

        System.out.println(R);
    }

    public static void main(String[] args) {
        new Main();
    }
}
