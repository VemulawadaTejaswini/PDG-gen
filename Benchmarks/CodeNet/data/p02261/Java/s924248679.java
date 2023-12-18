
import java.util.Arrays;
import java.util.Scanner;

/**
1 BubbleSort(C, N)
2   for i = 0 to N-1
3     for j = N-1 downto i+1
4       if C[j].value < C[j-1].value
5         C[j] と C[j-1] を交換
6
7 SelectionSort(C, N)
8   for i = 0 to N-1
9     minj = i
10    for j = i to N-1
11      if C[j].value < C[minj].value
12        minj = j
13    C[i] と C[minj] を交換 
 *
 * charAt(1)
 */

/**
 * C
 */
public class Main {

    void run() {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] c = new String[n];
        String[] c_copy = new String[n];

        for(int i=0; i<n; i++) {
            c[i] = sc.next();
            c_copy[i] = c[i];
        }

        bubbleSort(c, n);
        show(c, n);
        System.out.println("Stable");
        selectionSort(c_copy, n);
        show(c_copy, n);
        if(Arrays.equals(c, c_copy)) {
            System.out.println("Stable");
        } else {
            System.out.println("Not stable");
        }

        sc.close();

        //Debug
        /*
        for(String str : c) {
            System.out.print(str+" ");
        }
        System.out.println();
        for(String str : c_copy) {
            System.out.print(str+" ");
        }
        System.out.println();
        */

    }

    void bubbleSort(String[] c, int n) {
        for(int i=0; i<n-1; i++) {
            for(int j=n-1; j>i; j--) {
                if(c[j].charAt(1)<c[j-1].charAt(1)) {
                    String tmp = c[j];
                    c[j] = c[j-1];
                    c[j-1] = tmp;
                }   
            }
        }
    }

    void selectionSort(String[] c, int n) {
        for(int i=0; i<n; i++) {
            int minj = i;
            for(int j=i; j<n; j++) {
                if(c[j].charAt(1) < c[minj].charAt(1)) {
                    minj = j;
                }
            }
                String tmp = c[i];
                c[i] = c[minj];
                c[minj] = tmp;
        }
    }

    void show(String[] c, int n) {
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<n; i++) {
            sb.append(c[i]);
            if(i != n-1) {
                sb.append(" ");
            } else {
                sb.append("\n");
            }
        }

        System.out.print(sb);

    }

    public static void main(String[] args) {
        new Main().run();
    }

}
