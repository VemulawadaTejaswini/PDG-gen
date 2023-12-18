import java.util.*;

class Main {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long debt = 100;

        for (int x = 0; x < n; x++) {
            int residue = 0;
            if(debt % 20 != 0)  residue = 1;
            debt += debt / 20 + residue;
        }

        System.out.print(debt);
        System.out.println("000");
    }
}