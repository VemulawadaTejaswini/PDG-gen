import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        ArrayList<Double> ald = new ArrayList<>();
        while(scn.hasNextDouble()) {
            ald.add(scn.nextDouble());
        }
        Collections.sort(ald);
        System.out.println(ald.get(ald.size() - 1) - ald.get(0));
    }
}