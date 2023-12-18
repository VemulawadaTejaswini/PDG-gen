import java.util.Hashtable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] a = new String[n];
        String[] b = new String[n];
        for (int i = 0; i < n; i++) {
            String next = in.next();
            a[i] = next;
            b[i] = next;
        }
        bubbleSort(a);
        selectionSort(b);
    }

    private static void bubbleSort(String[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j > i; j--) {
                if (compareCards(a[j], a[j-1]) < 0) {
                    String swap = a[j-1];
                    a[j-1] = a[j];
                    a[j] = swap;
                }
            }
        }
        System.out.println(printArray(a));
        System.out.println("Stable");
    }

    private static void selectionSort(String[] a) {
        int n = a.length;
        boolean stable = true;
        Hashtable<Integer, Integer> hash = new Hashtable<>();
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i; j < n; j++) {
                if (compareCards(a[j], a[min]) < 0) {
                    min = j;
                }
            }
            int key = Character.getNumericValue(a[i].charAt(1));
            if (hash.containsKey(key) && i < hash.get(key)) {
                stable = false;
            }
            hash.put(key, min);
            String swap = a[i];
            a[i] = a[min];
            a[min] = swap;
        }
        System.out.println(printArray(a));
        if (stable) {
            System.out.println("Stable");
        } else {
            System.out.println("Not stable");
        }
    }

    private static int compareCards(String c1, String c2) {
        int c1Val = Character.getNumericValue(c1.charAt(1));
        int c2Val = Character.getNumericValue(c2.charAt(1));
        return Integer.compare(c1Val, c2Val);
    }

    private static String printArray(String[] a) {
        int length = a.length;
        String arrayString = "";
        for (int i = 0; i < length - 1; i++) {
            arrayString = arrayString + a[i] + " ";
        }
        arrayString = arrayString + a[length - 1];
        return arrayString;
    }
}

