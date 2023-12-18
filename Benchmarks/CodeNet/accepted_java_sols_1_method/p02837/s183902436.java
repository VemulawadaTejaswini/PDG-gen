import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        ArrayList<ArrayList<Integer[]>> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            arr.add(new ArrayList<>());
            int a = sc.nextInt();
            for(int j = 0; j < a; j++) {
                arr.get(i).add(new Integer[2]);
                arr.get(i).get(j)[0] = sc.nextInt();
                arr.get(i).get(j)[1] = sc.nextInt();
            }
        }
        int num = (1 << n) - 1;
        while(num > 0) {
            int[] list = new int[n];
            int m = num;
            for(int i = 0; i < n; i++) {
                list[i] = m % 2;
                m >>= 1;
            }
            boolean flag = true;
            int i = 0;
            for(ArrayList<Integer[]> array : arr) {
                for(Integer[] ar : array) {
                    if(list[i] == 1 && list[ar[0] - 1] != ar[1]) {
                        flag = false;
                        break;
                    }
                }
                i++;
            }
            if(flag) ans = Math.max(ans, Integer.bitCount(num));
            num -= 1;
        }
        System.out.println(ans);
    }
}
