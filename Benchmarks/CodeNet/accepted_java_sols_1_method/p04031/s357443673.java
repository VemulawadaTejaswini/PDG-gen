import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        int total = 0;
        for(int i = 0; i < n; i++){
            ar[i] = sc.nextInt();
            total += ar[i];
        }
        int a = total / n;
        int b = a + 1;
        long costa = 0;
        long costb = 0;
        for(int i = 0; i < n; i++){
                costa += (ar[i] - a) * (ar[i] - a);
                costb += (ar[i] - b) * (ar[i] - b);
        }
        if(costa < costb)
                System.out.println(costa);
        else{
                System.out.println(costb);
        }

    }
}
