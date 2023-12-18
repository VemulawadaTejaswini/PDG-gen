import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int x=0;
        if(a<=b){
             for(int i=a;i<=b; i++){
            if(c%i==0){
                x=x+1;
            }
            else{
                x=x;
            }
        }
        }
        else{
             for(int i=b;i<=a; i++){
            if(c%i==0){
                x=x+1;
            }
            else{
                x=x;
            }
        }
        }
        System.out.println(x);
    }
}