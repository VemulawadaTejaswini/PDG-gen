import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        long sum = 0;
        ArrayList<Integer> ali = new ArrayList<>();
        for(int a = scn.nextInt(); scn.hasNext(); sum += a) {
            a = scn.nextInt();
            ali.add(a);
        }
        Collections.sort(ali);
        System.out.println(
          ali.get(0) + " " + ali.get(ali.size() - 1) + " " + sum
        );
    }
}