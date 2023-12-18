import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        int sum = 0;
        int min = 0;
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(scanner.next());
            if (i==0||a<min){min=a;}
            sum+=a;
        }
        System.out.println(sum - min);
        }
    }
