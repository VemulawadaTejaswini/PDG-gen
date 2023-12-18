
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String line = sc.nextLine();
    int N = Integer.parseInt(line);

    line = sc.nextLine();
    String[] lines = line.split(" ");

    long ans = 1;

    for(int i = 0; i<N; i++) {
        ans = ans * Long.parseLong(lines[i]);
    }

    if (ans > 100000000000000000L) {
        ans = -1;
    }

    System.out.println(ans);
    }
}
