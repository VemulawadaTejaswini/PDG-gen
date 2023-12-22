import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        Arrays.sort(a);
        if(n==2)System.out.println((a[0]==a[1])?0:a[1]-a[0]);
        else if(a[n/2]-a[n/2-1]==0){
            System.out.println(0);
        }
        else 
            System.out.println(a[n/2]-a[n/2-1]);
        //else System.out.println((a[n/2]-a[n/2-1]==0)?0:(a[n/2-1]==a[n/2-2])?(a[n/2]==a[n/2+1])?a[n/2]-a[n/2-1]-1:a[n/2]-a[n/2-1]:(a[n/2]==a[n/2+1])?a[n/2]-a[n/2-1]:a[n/2]-a[n/2-1]+1);
    }
}
