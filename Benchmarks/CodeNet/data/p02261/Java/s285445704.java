import java.util.*;
import java.lang.*;


public class Main {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] a = new String[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.next();
        }
        
        String[] bubble = Arrays.copyOf(a, n);
        String[] selection = Arrays.copyOf(a, n);
        
        // bubble sort
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                if (Character.getNumericValue(bubble[j].charAt(1)) <
                    Character.getNumericValue(bubble[j - 1].charAt(1))) {
                    String tmp = bubble[j];
                    bubble[j] = bubble[j - 1];
                    bubble[j - 1] = tmp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(bubble[i]);
            if (i != n - 1) {
                System.out.print(' ');
            }
        }
        System.out.println();
        System.out.println("Stable");
        
        
        // selection
        for (int i = 0; i < n; i++) {
            int minj = i;
            for (int j = i; j < n; j++) {
                if (Character.getNumericValue(selection[j].charAt(1)) <
                    Character.getNumericValue(selection[minj].charAt(1))) {
                    minj = j;
                }
            }
            String tmp = selection[i];
            selection[i] = selection[minj];
            selection[minj] = tmp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(selection[i]);
            if (i != n - 1) {
                System.out.print(' ');
            }
        }
        System.out.println();
        
        if (Arrays.equals(bubble, selection)) {
            System.out.println("Stable");
        } else {
            System.out.println("Not stable");
        }
    }
}

