import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for(int i=1;i<=n;i++) a[i]=sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
            if(a[a[i]]==i) sum++;
        }
        System.out.println(sum/2);
    }
}
