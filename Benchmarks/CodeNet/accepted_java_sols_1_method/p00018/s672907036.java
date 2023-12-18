import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        ArrayList<Integer> ali = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            ali.add(scn.nextInt());
        }
        Collections.sort(ali);
        Collections.reverse(ali);
        StringBuilder sb = new StringBuilder();
        for(int elm : ali) {
            sb.append(elm + " ");
        }
        System.out.println(sb.toString().trim());
    }
}