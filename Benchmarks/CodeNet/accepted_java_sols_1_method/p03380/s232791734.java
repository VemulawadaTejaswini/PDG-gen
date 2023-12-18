/*
String[]の初期化、整数の型がlongになっているか
関数（splitとかcontainsとか）内では"+"とかは正規表現となされるので"\\+"とする
配列のコピーはarr1=arr.clone()
HashSet<>[]はおのおの初期化した？？？？？
 */
import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        out.print(a[n-1]+" ");
        int index=0;
        if(a[n-1]%2==0){
            index=Arrays.binarySearch(a,a[n-1]/2);
            if(index>=0){
                out.println(a[n-1]/2);
            }else {
                index=~index;
                if(index==0)out.println(a[0]);
                else if(index==n)out.println(a[n-1]);
                else {
                    if(a[n-1]/2-a[index-1]>a[index]-a[n-1]/2){
                        out.println(a[index]);
                    }else {
                        out.println(a[index-1]);
                    }
                }
            }
        }else {
            index=Arrays.binarySearch(a,a[n-1]/2);
            int index0=Arrays.binarySearch(a,a[n-1]/2+1);
            if(index>=0){
                out.println(a[n-1]/2);
            }else if(index0>=0){
                out.println(a[n-1]/2+1);
            }else {
                index=~index;
                if(a[n-1]/2-a[index-1]>a[index]-a[n-1]/2){
                    out.println(a[index]);
                }else {
                    out.println(a[index-1]);
                }
            }
        }
    }
}