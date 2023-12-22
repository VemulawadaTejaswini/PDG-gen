import java.util.Scanner;

public class Main{
    public static void main(String[] args){

       Scanner sc =new Scanner(System.in);

        int N=sc.nextInt();
        String ans="No";
        int c=0;
        int d=0;

        while((4*c+7*d)<=N){
            while((4*c+7*d)<=N){
               if((4*c+7*d)==N){
                    ans="Yes";
                    break;
                }else{c++;}
            }
            d++;
            c=0;
        }
        System.out.println(ans);
    }
}