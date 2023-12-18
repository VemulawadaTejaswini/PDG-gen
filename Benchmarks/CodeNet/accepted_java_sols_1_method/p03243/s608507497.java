import java.util.*;
public class Main{
    public static void main(String []args){
        Scanner x=new Scanner(System.in);
        int a=x.nextInt();
        while(100<=a&&a<=999){
            int b=a/100;
            int c=a%100/10;
            int d=a%100%10/1;
            int bb=(b*100)+(b*10)+b;
            if(bb>=a){
                System.out.println(bb);
                break;
            }
            else{
                System.out.println((b+1)*100+(b+1)*10+(b+1));
                break;
            }
        }
     }
}