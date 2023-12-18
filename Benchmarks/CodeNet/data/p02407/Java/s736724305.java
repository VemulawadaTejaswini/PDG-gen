import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> ls = new ArrayList<>();

        for (int i = 0; i < n; i++) ls.add(scan.nextInt());

        Collections.reverse(ls);
        for (int i = 0; i < ls.size(); i++) {
            System.out.print(i == ls.size() -1? ls.get(i) : ls.get(i) + " ");
        }
        System.out.println();
    }
}