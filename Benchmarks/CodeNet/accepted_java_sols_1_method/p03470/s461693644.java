import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> s = new HashSet<>();
        int d = 0;

        for(int i=0; i<n; i++){
            d = sc.nextInt();
            if(!s.contains(d)){
                s.add(d);
            }
        }
        System.out.println(s.size());
        sc.close();
    }
}