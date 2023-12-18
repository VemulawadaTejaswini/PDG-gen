import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] array = new int[n];

        for(int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }

        for(int i = n-1; i > 0; i--){
            System.out.print(array[i] + " ");
        }
        System.out.println(array[0]);
        scanner.close();
    }
}

