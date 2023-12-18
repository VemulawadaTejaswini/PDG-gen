import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] C = br.readLine().split(" ");

        String[] cards;
        String stability;

        cards = C.clone();
        bubbleSort(cards);
        stability = isStable(C, cards);
        outputArray(cards, N);
        System.out.println(stability);

        cards = C.clone();
        selectionSort(cards);
        stability = isStable(C, cards);
        outputArray(cards, N);
        System.out.println(stability);
    }

    public static void bubbleSort (String[] arr) {
        int i, j;
        String temp;
        int n = arr.length;
        for (i = 0; i < n; i++) {
            for (j = n-1; j > i; j--) {
                if (arr[j-1].charAt(1) > arr[j].charAt(1)) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void selectionSort (String[] arr) {
        int i, j;
        String temp;
        int n = arr.length;
        int mini;
        for (i = 0; i < n; i++) {
            mini = i;
            for (j = i; j < n; j++) {
                if (arr[j].charAt(1) < arr[mini].charAt(1)) {
                    mini = j;
                }
            }
            if (i != mini) {
                temp = arr[i];
                arr[i] = arr[mini];
                arr[mini] = temp;
            }
        }
    }

    public static void outputArray (String[] arr, int n) {
        StringBuilder output = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            output.append(arr[i]);
            if (i != n-1) {
                output.append(" ");
            }
        }
        System.out.println(output.toString());
    }

    public static String isStable (String[] original, String[] sorted) {
        int i, j, n = original.length;
        String ori, sor;
        for (i = 1; i < 10; i++) {
            ori = sor = "";
            for (j = 0; j < n; j++) {
                if (Character.getNumericValue(original[j].charAt(1)) == i) {
                    ori += Character.toString(original[j].charAt(0));
                }
                if (Character.getNumericValue(sorted[j].charAt(1)) == i) {
                    sor += Character.toString(sorted[j].charAt(0));
                }
            }
            if (!ori.equals(sor)) return "Not stable";
        }
        return "Stable";
    }
}