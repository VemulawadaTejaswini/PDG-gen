import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int x,tmp_500,tmp_5,sum;
        x=scan.nextInt();
        sum = 0;
        tmp_500= x/500;
        sum +=tmp_500*1000;
        tmp_5=(x-tmp_500*500)/5;
        tmp_5*=5;
        sum+=tmp_5;
        System.out.println(sum);
    }
}