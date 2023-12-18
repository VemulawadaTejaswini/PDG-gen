import java.util.*;

public class Main {
    public static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        ArrayList<Integer> ali = new ArrayList<>();
        while(scn.hasNextInt()) {
            ali.add(scn.nextInt());
        }
        Collections.sort(ali);
        Collections.reverse(ali);
        for(int i = 0; i < 3; i++) {
            System.out.println(ali.get(i));
        }
    }
}