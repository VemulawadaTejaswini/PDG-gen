import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] box = new int[n];
 
        for(int a = 0; a < n;a++) {
            nums[a] = scanner.nextInt();
 
        }
 
        for(int a = n - 1;a >= 0 ;a--) {
            System.out.print(nums[a]);
            if(a != 0 ) {
                System.out.print(" ");
            }
        }
        System.out.println();
 
    }
}