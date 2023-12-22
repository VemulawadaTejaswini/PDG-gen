import java.util.*;
        import java.io.*;
        import java.lang.*;
public class Main{
    private static void Solve(){
        Scanner in = new Scanner(System.in);
        int n; n = in.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = in.nextInt();
        int sum = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(i!=j)
                    sum += (arr[i]*arr[j]);
            }
        }
        System.out.println(sum);
    }
    public static void main(String []args){
        Solve();
    }
}