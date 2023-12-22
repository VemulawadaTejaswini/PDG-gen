
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<String> kind = new HashSet<>();
        int N = in.nextInt();
        in.nextLine();
        for(int i = 1; i <= N; i++){
            kind.add(in.nextLine());
        }
        System.out.print(kind.size());
    }

}
