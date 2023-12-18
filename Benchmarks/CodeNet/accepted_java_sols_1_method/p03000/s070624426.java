import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int []a=new int[n];
        int d=0,count=0;
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        while(true){
            d+=a[count];
            count++;
            if(d>x)break;
            if(count==n){
                count++;
                break;
            }
        }
        System.out.println(count);
    }
}
