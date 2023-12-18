import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        ArrayList<Integer> ali = new ArrayList<>();
        for(int i = 0, n = scn.nextInt(); i < n; i++) {
            ali.add(scn.nextInt());
        }
        Collections.reverse(ali);
        for(int i = 0; i < ali.size() - 1; i++) {
            System.out.print(ali.get(i) + " ");
        }
        System.out.println(ali.get(ali.size() - 1));
    }
}