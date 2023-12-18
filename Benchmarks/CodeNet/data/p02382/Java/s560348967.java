import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str;
        int a,i;
        int[] x,y;
        double ans,m;
        str = scan.nextLine();
        a = Integer.valueOf(str);
        x = new int[a];
        y = new int[a];
        ans = 0;
        str = scan.nextLine();
        String[] num1 = str.split(" ", 0);
        for(i=0;i<a;i++){
            x[i] = Integer.valueOf(num1[i]);
        }
        str = scan.nextLine();
        String[] num2 = str.split(" ", 0);
        for(i=0;i<a;i++){
            y[i] = Integer.valueOf(num2[i]);
        }
        for(i=0;i<a;i++){
            ans += Math.abs(x[i]-y[i]);
        }
        System.out.println(ans);
        ans = 0;
        for(i=0;i<a;i++){
            ans += Math.pow(Math.abs(x[i]-y[i]), 2);
        }
        System.out.println(Math.sqrt(ans));
        ans = 0;
        for(i=0;i<a;i++){
            ans += Math.pow(Math.abs(x[i]-y[i]), 3);
        }
        System.out.println(Math.cbrt(ans));
        ans = 0;
        for(i=0;i<a;i++){
            if(Math.abs(x[i]-y[i])>ans){
                ans = Math.abs(x[i]-y[i]);
            }
        }
        System.out.println(ans);
        scan.close();
    }
}

