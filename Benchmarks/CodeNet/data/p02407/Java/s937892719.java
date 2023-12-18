import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int c;
        for(int i = 0; i < n; i++){
        	c = sc.nextInt();
        	a[i] = c;
        	b[i] = c;
        }
        for(int i = 0; i < n; i++){
        	a[i] = b[n - i - 1];
        	System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
