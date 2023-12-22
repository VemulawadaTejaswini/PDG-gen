import java.util.Scanner;

public class Main{

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int score=0;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();

        if(d-a-b<=0){
            if(a>=d){
                score=d;
            }else {
                score = a*1+b*0;
            }
        }else{
            int temp=d;
            int tscore=a*1+b*0;
             temp=d-a-b;
            score=tscore+temp*-1;








        }




        System.out.print(score);



    }

}
