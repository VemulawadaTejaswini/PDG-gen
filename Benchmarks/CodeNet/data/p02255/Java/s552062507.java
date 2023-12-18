import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main (String... args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        
        String[] sNumbers = scanner.nextLine().split(" ");
        Integer[] nNumbers = Arrays.asList(sNumbers).stream().map(Integer::parseInt).toArray(Integer[]::new);
        
        insertSort(nNumbers, N);
    }
    
    private static void insertSort(Integer[] a, int n) {
        output(a);
        for (int i=1; i <= n-1; i++) {
            int v = a[i];
            int j = i - 1;
            
            while (j >=0 && a[j] > v) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = v;
            output(a);
        }
    }
    
    private static void output(Integer[] a) {
        StringBuilder builder = new StringBuilder();
        for (int i=0; i < a.length; i++) {
            if (i < a.length - 1) {
                builder.append(a[i] + " ");
            } else {
                builder.append(a[i] + "");
            }
        }
        System.out.println(builder.toString());
    }
}

