import java.util.Scanner;
import java.util.TreeSet;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
           int n;
           n=sc.nextInt();
           if(n==0)break;
           int x[]=new int[n];
           for(int i=0;i<n;i++){
               x[i]=sc.nextInt();
        }
        Arrays.sort(x);
        int ans=0;
        for(int i=1;i<n-1;i++){
            ans+=x[i];
        }
        ans/=(n-2);
        System.out.println(ans);
    }
}
}

