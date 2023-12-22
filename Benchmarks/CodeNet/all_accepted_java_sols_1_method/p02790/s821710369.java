import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        StringBuilder nStr = new StringBuilder();
        int m = scn.nextInt();
        StringBuilder mStr = new StringBuilder();
        for(int i  = 0 ; i < n;i++){
            nStr.append(m) ;
        }
        for(int i = 0 ;i <m ; i ++) {
            mStr.append(n);
        }
        String[] arr = {nStr.toString(),mStr.toString()};
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
}
