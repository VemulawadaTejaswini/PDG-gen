import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        char[] arr = sc.next().toCharArray();
        int[] countArr = new int[n];
        int count = 0;

        countArr[0] = 0;
        for (int i = 1; i < arr.length; i++) {
            if ("AC".equals("" + arr[i - 1] + arr[i])) {
                count++;
            }
            countArr[i] = count;
        }

//        for (int i = 0; i < countArr.length; i++) {
//            System.out.print(countArr[i]);
//        }
//        System.out.println("+++++++++");
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(countArr[r - 1] - countArr[l - 1]);
        }
    }
}
