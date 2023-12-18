import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int max=0, min=10000000, sum=0, ave=0;
            int n = sc.nextInt();
            if(n==0)break;
            int[] s = new int[n];
            for(int i=0;i<n;i++){
                s[i] = sc.nextInt();
                if(max<s[i]) max=s[i];
                if(min>s[i]) min=s[i];
                sum += s[i];
            }
            ave = (sum-max-min)/(n-2);
            System.out.println(ave);
        }
    }
}
