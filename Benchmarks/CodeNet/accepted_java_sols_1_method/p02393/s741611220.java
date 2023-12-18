import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a < b){
            if(b < c){
                System.out.printf("%d %d %d\n",a,b,c);
            }else{//c <= b
                if(a < c) {
                    System.out.printf("%d %d %d\n",a,c,b);
                }else{
                    System.out.printf("%d %d %d\n",c,a,b);
                }
            }
        }else{//b <= a
            if(a < c){
                System.out.printf("%d %d %d\n",b,a,c);
            }else{//c <= a
                if(b < c){
                    System.out.printf("%d %d %d\n",b,c,a);
                }else{
                    System.out.printf("%d %d %d\n",c,b,a);
                }
            }
        }
    }
}
