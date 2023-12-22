import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isApproved = true;
        int n = sc.nextInt();
        int[] intArray = new int[n];
        for(int i = 0; i < n; i++) intArray[i] = Integer.parseInt(sc.next());
        for(int num : intArray) {
            if(num % 2 == 0) {
                if(num % 3 != 0 && num % 5 != 0) isApproved = false;
            }
        }

        System.out.println(isApproved ? "APPROVED" : "DENIED");
    }
}
