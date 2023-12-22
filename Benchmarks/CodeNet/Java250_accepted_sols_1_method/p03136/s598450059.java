import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
           arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int maxLength = arr[0];
        
        for (int i = 1; i < N; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            maxLength += arr[i];
        }

        if (max >= maxLength - max) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

     }
}