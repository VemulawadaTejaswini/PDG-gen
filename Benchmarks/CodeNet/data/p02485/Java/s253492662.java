import java.util.Scanner;
public class Main{
    public static void main(String []args){
        int j=3;
        Scanner sc=new Scanner(System.in);
        while(true){
            int a=sc.nextInt();
            if(a==0){
                break;
            }
            int i=0;
            int []b=new int[j];
            while(a>=10){
               b[i]=a%10;
                a=a/10;
                i++;
            }
            System.out.println(a+b[0]+b[1]);
        }
    }
}