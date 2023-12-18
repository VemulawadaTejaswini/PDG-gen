import java.util.*;

class Main {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Character> before = new ArrayList<Character>();
        ArrayList<Character> after = new ArrayList<Character>();

        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;

            for (int i = 0; i < n; i++) {
                before.add(sc.next().charAt(0));
                after.add(sc.next().charAt(0));
            }

            int m = sc.nextInt();

            for (int i = 0; i < m; i++) {
                char test = sc.next().charAt(0);
                for (int j = 0; j < n; j++) {
                    if ( before.get(j) == test ) {
                        test = after.get(j);
                        break;
                    }
                }
                System.out.print(test);
            }
            System.out.print("\n");
        }
             
             
    }
}