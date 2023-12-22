import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x,y,i;

        for(i = 0;i < 3;i++){
            if(a > b){
                x = a;
                a = b;
                b = x;
            }
            if(a > c){
                x = a;
                a = c;
                c = x;
            }
            if(b > c){
                y = b;
                b = c;
                c = y;
            }
        }

        System.out.printf("%d %d %d\n",a,b,c);

    }
}
