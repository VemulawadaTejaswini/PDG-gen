import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();

        for(int i=0; i<n; i++) {
            a.add(sc.nextInt());
        }
        sc.close();

        Collections.reverse(a);
        for(int i=0; i<a.size(); i++) {
            if(i == a.size()-1) {
                System.out.println(a.get(i));
            } else {
                System.out.print(a.get(i) + " ");
            }
        }
    }
}

