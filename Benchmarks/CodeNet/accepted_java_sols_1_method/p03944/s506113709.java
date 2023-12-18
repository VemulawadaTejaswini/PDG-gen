import java.util.*;

class Main{

    static final int DIV = 100000007;

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int n = sc.nextInt();
        int[] x = new int[w+1];
        int[] y = new int[h+1];
        for(int i = 0;i < n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(c == 1)for(int j = 0;j<a;j++)x[j]++;
            if(c == 2)for(int j = a+1;j<=w;j++)x[j]++;
            if(c == 3)for(int j = 0;j<b;j++)y[j]++;
            if(c == 4)for(int j = b+1;j<=h;j++)y[j]++; 
        }
        int xans = 0;
        int yans = 0;
        int ans = 0;
        for(int i=0;i<=w;i++)if(x[i]==0)xans++;
        for(int j=0;j<=h;j++)if(y[j]==0)yans++;
        if(xans>0&&yans>0)ans = (xans-1)*(yans-1);
        System.out.println(ans);
    }
}