import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str;
        int a,i;
        double ans,m;
        while(true) {
            m = 0;
            ans = 0;
            str = scan.nextLine();
            a = Integer.valueOf(str);
            if(a==0){
                break;
            }
            str = scan.nextLine();
            String[] num = str.split(" ", 0);
            int[] res = new int[a];
            for(i=0;i<a;i++){
                res[i] = Integer.valueOf(num[i]);
                m = (m*i + res[i])/(i+1);
            }
            for(i=0;i<a;i++){
                ans += Math.pow((res[i]-m),2)/a;
            }
            System.out.println(Math.sqrt(ans));
        }
        scan.close();
    }
}

