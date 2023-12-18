import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        Integer[] arr = new Integer[n];
        boolean is [] = new boolean[(int)1e7];

        int cn=n;
        for (int i = 0; i < n; i++) {
            arr[i] =sc.nextInt();
        }
        Arrays.sort(arr);
        if(n==1) {
            System.out.println(1); return;
        }
        for (int i = 1; i <n ; i++) {
            for (int j = i-1; j >=0 ; j--) {
                if( arr[i]%arr[j]==0){
                    if(arr[i].equals(arr[j]) && !is[arr[i]]){
                        cn--;
                        is[arr[i]]=true;
                    }
                    cn--;
                    break;
                }
            }
        }
        System.out.println(cn);


    }
}