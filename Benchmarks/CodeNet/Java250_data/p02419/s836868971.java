import java.util.*;
 
public class Main {
    private static final Scanner scn = new Scanner(System.in);
     
    public static void main(String[] args) {
        String ptn = scn.next().toLowerCase();
        ArrayList<String> als = new ArrayList<>();
        while(scn.hasNext()) {
            als.add(scn.next().toLowerCase());
        }
        System.out.println(Collections.frequency(als, ptn));
    }
}