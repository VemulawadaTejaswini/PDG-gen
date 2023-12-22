import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                int a=sc.nextInt();
                int b=sc.nextInt();
                int c=sc.nextInt();
                int d=sc.nextInt();
                int e=sc.nextInt();
                int f=sc.nextInt();
                int g=sc.nextInt();
                int h=sc.nextInt();
                int ten=a+b+c+d;
                int tenten=e+f+g+h;
                if (ten<tenten){
                    System.out.println(tenten);
                }else if (ten>tenten){
                    System.out.println(ten);
                }if (ten==tenten){
                    System.out.println(ten);
                }
            }

        }