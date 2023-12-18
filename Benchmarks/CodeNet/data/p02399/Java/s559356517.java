import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int d = a/b;
        int r = a%b;
        System.out.print(d+" "+r+" ");
        double f = (double)a/(double)b;
        System.out.printf("%.5f\n", f); 
        
        sc.close();
    }
}

