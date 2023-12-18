import java.util.Scanner;

public class Main {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);{
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
                count += bs(arr1, n);

            System.out.println(count);
        }
    }
    public static int bs(int[] arr, int e) {
        int lower = 0;
        int mid = arr.length/2;
        int upper = arr.length;

        while(lower < upper) {
            if(arr[mid] == e) return 1;
            else if(mid == lower) return 0;
            else if(mid == upper) mid--;
            else if(e < arr[mid]) {
                upper = mid;
                mid -= (upper - lower) / 2;
            } else {
                lower = mid;
                mid += (upper - lower) / 2;
            }
        }
        return 0;
    }
}

