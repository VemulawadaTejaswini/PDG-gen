import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int hw=in.nextInt();
        int sum=0;
        for (int i = 0; i <hw; i++) {
            int x=in.nextInt();
            sum=sum+x;
        }
        int ans=num-sum;
        if(ans<0){
            System.out.println(-1);
        }else{
            System.out.println(ans);
        }
    }
}