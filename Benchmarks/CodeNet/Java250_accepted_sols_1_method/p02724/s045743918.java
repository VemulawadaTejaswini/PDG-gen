import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int rem=n;
        int hap=0;
        int ans=0;
        if (n>=500){
            hap=n/500;
            ans=hap*1000;
            n=n-((n/500)*500);
        }
        if (n>=5){
            hap=n/5;
            ans=ans+hap*5;
        }
        System.out.println(ans);
    }
}
