import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        int temp = 0 ;

        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
            temp += a[i] - 1;
        }

        Arrays.sort(a);


        System.out.println(temp);
//        int[] ans = new int[temp + 1];
//
//        for(int i = 0;i < temp + 1;i ++){
//            for(int j = 0;j < n;j ++){
//                ans[i] += i % a[j];
//            }
//        }
//
//        Arrays.sort(ans);
//
//        for(int i = 0;i<temp + 1;i++){
//            System.out.print(ans[i]+" ");
//            if(i == n-1)
//                System.out.println("");
//        }
//
//        System.out.println(ans[temp]);
    }
}