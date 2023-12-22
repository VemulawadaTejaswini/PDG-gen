import java.util.Scanner;

public class Main{

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int score=0;
        String x="";
        a=sc.nextInt();


        x=sc.next();

        if(x.length()>a){
            x=x.substring(0,a)+"...";


        }
        System.out.print(x);



    }

}



