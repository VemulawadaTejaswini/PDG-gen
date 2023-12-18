import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        for(int i = 0; i < 5; i++) {
            array[i] = sc.nextInt();
        }
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int d = sc.nextInt();
//        int e = sc.nextInt();
        int k = sc.nextInt();
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if(Math.abs(array[i]- array[j]) > k) {
                    System.out.println(":(");
                    return;
                }
            }
        }
        System.out.println("Yay!");
    }
}