
import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n= in.nextInt();
        int k=in.nextInt();
        double res=0;
        for(int i=1;i<=n;i++){
            double temp = 1.0/n;
            int now =i;
            while(now<k){
                now=now*2;
                temp=temp/2;
            }
            res+=temp;
        }
        System.out.println(res);
    }
}
