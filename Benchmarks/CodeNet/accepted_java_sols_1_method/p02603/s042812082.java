import org.w3c.dom.ls.LSOutput;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]= new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        long money=1000;
        for (int start=0;start+1<n;start++){
            int end=start+1;
            if (a[end]<=a[start])continue;
//            while (end<n&&a[end]>a[start]){
//                end++;
//            }
            long times=money/a[start];
            money%=a[start];
            money+=a[end]*times;
//            start=end-1;
        }
        System.out.println(money);

    }
}




