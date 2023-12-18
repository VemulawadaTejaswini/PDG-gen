import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        for (int i = str.length() - 1; i >= 0; i--){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}

