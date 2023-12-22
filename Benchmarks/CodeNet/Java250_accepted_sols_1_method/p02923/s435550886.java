import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] b = new int[n];
        int count = 0, maxCount = 0;
        for (int i = 0;i < n;i++){
            b[i] = sc.nextInt();
        }
        sc.nextLine();
        for (int i = 0; i < n - 1;i++){
            if (b[i] < b[i + 1]){
                if (maxCount < count){
                    maxCount = count;
                }
                count = 0;
            }else{
                count++;
            }
        }
        if (maxCount < count){
            maxCount = count;
        }
        System.out.println(maxCount);
    }
}