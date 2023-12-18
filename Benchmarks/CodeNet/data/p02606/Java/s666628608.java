import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        if(a>b){
            int swap=a;
            a=b;
            b=swap;
        }int count=0;
        for (int i = a+1; i <=b; i++) {
            if(i%c==0){
                count++;
            }
        }
        System.out.println(count);
        
    }
}