import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int[] l=new int[n];
        int sum=0,max=0;
        for (int i = 0; i < n; i++) {
            l[i]=sc.nextInt();
            max=max(max,l[i]);
            sum+=l[i];
        }
        sum-=max;
        if(sum>max){
            out.println("Yes");
        }else out.println("No");
    }
}