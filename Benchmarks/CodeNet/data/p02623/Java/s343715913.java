import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = scan.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for(int i = 0;i<n;i++)a.add(scan.nextInt());
        for(int i = 0;i<m;i++)b.add(scan.nextInt());
        int sum = 0,ans = 0,res = 0,i = 0,j = 0;
        for(;i<n;i++){
            if(sum+a.get(i)<=k){
                ans++;
                sum+=a.get(i);
            }else break;
        }
        for(;j<m;j++){
            if(sum+b.get(j)<=k){
                ans++;
                sum+=b.get(j);
            }else break;
        }
        res = ans;
        i = Math.min(n-1,i);
        for(;i>=0;i--){
            sum-=a.get(i);
            ans--;
            for(;j<m;j++){
                if(sum+b.get(j)<=k){
                    ans++;
                    sum+=b.get(j);
                }else break;
            }
            res = Math.max(res, ans);
        }
        out.println(res);
        scan.close();
        out.flush();
    } 
}