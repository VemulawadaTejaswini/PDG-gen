import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] iary = new int[n];
        for (int i = 0; i < n; i++) {
            iary[i] = sc.nextInt();
        }
        iary = sort(iary);
        for (int i = 0; i < n; i++) {
            System.out.printf("%d", iary[i]);
            if(i != n-1) System.out.printf(" ");
        }
        System.out.printf("\n");
    }

    public static int[] sort(int[] iary) {
        int l = iary.length;
        int tmp;
        for (int i = 0; i < l-1; i++) {
            for (int j = 0; j < l-1; j++) {
                if(iary[j]>iary[j+1]){
                    tmp = iary[j+1];
                    iary[j+1] = iary[j];
                    iary[j] = tmp;
                }
            }
        }
        return iary;
    }
}