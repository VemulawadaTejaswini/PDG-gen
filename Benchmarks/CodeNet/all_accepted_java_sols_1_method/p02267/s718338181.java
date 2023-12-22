import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int arr1Size = sc.nextInt();
        int[] arr1 = new int[arr1Size];
        for(int i = 0; i < arr1Size; ++i)
            arr1[i] = sc.nextInt();

        int arr2Size = sc.nextInt();
        int[] arr2 = new int[arr2Size];
        for(int i = 0; i < arr2Size; ++i)
            arr2[i] = sc.nextInt();

        int count = 0;

        for(int n : arr2)
            for(int m : arr1){
                count += n == m ? 1 : 0;
                if(n==m) break;
            }

        System.out.println(count);
    }
}

