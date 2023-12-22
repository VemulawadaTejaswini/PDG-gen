import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());

        int p = x-k+1;
        StringJoiner sj = new StringJoiner(" ");
        for(Integer i=p; i < x+k; i++){
            sj.add(i.toString());
        }
        System.out.println(sj.toString());

        sc.close();
    }
}