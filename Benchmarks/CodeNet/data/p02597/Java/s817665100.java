import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String s = scanner.next();
        char[] c = s.toCharArray();

        int red = 0;
        for (int i = 0; i < N; i++) {
            if (c[i] == 'R') red++;
        }

        int answer = 0;
        for (int i = 0; i < red; i++){
            if (c[i] == 'W') answer++;
        }

        System.out.println(answer);
    }

}
