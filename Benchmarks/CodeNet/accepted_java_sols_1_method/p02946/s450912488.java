import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputKX = scan.nextLine().split(" ");
        Integer k = Integer.valueOf(inputKX[0]);
        Integer x = Integer.valueOf(inputKX[1]);

        List<String> results = new ArrayList<String>();
        for(Integer i=x-(k-1); i<=x+(k-1); i++) {
            results.add(i.toString());
        }
        System.out.println(String.join(" ", results));
        scan.close();
    }
}