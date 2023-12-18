import java.util.*;
public class Main{
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int arr[] = new int[3];
        arr[0] =sc.nextInt();
        arr[1] =sc.nextInt();
        arr[2] =sc.nextInt();
        int ans = 0;
        Arrays.sort(arr);
        for(int i=1;i<3;i++){
            ans+=arr[i]-arr[i-1];
        }
        System.out.println(ans);
    }
}
