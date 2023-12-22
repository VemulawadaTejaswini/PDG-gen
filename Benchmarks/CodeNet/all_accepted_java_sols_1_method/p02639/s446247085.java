import java.util.*;


public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        String[] array = str.split(" ");
//        System.out.println(array[0]);
//        System.out.println(Arrays.toString(array));
        int sum = 0;
        for(int i=0; i<array.length; i++) {
            int num = Integer.parseInt(array[i]);
            sum += num;
        }
        System.out.println(15-sum);
    }
}