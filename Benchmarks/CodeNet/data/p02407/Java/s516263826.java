import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        List<Integer> lis = new ArrayList<Integer>();
        int n = scn.nextInt();
        for(int i = 0; i < n; i++) {
            lis.add(scn.nextInt());
        }
        Collections.reverse(lis);
        for(int i = 0; i < n; i++) {
            System.out.print(lis.get(i));
            if(i == ~-n) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
    }
}