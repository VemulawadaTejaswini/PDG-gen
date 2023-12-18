import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        String[] a = new String[n];
        String[] b = new String[n];
        for(int i = 0; i < n; i++) {
            String c = sc.next();
            char mark = c.charAt(0);
            char num = c.charAt(1);
            a[i] = String.valueOf(mark) + String.valueOf(num);
            b[i] = String.valueOf(mark) + String.valueOf(num);
        }

        bubbleSort(a, n);
        selectionSort(b, n);

        printArray(a, n);
        System.out.println("Stable");
        printArray(b, n);
        if(equals(a, b, n)){
            System.out.println("Stable");
        }else{
            System.out.println("Not stable");
        }
    }

    private static void printArray(String[] a, int n) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            if(i != 0) sb.append(" ");
            sb.append(a[i]);
        }
        System.out.println(sb);
    }

    private static boolean equals(String[] a, String[] b, int n) {
        for(int i = 0; i < n; i++) {
            if(!a[i].equals(b[i])) return false;
        }
        return true;
    }

    private static void bubbleSort(String[] a, int n) {
        boolean flag = true;
        while(flag) {
            flag = false;
            for(int j = n - 1; j >= 1; j--) {
                if(a[j].charAt(1) < a[j - 1].charAt(1)) {
                    String tmp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = tmp;
                    flag = true;
                }
            }
        }
    }

    private static void selectionSort(String[] a, int n) {
        for(int i = 0; i < n - 1; i++) {
            int minj = i;
            for(int j = i + 1; j < n; j++) {
                if(a[j].charAt(1) < a[minj].charAt(1)) minj = j;
            }

            if(i != minj){
                String tmp = a[i];
                a[i] = a[minj];
                a[minj] = tmp;
            }
        }
    }
}
