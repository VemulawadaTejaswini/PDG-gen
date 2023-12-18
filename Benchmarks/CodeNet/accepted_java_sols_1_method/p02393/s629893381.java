import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int c = stdIn.nextInt();

        if(a < b){
            if(b < c){
                System.out.printf("%d %d %d\n",a,b,c);
            }

            else if(a < c){
                System.out.printf("%d %d %d\n",a,c,b);
            }
            
            else{
                System.out.printf("%d %d %d\n",c,a,b);
            }

        }

        else{
            if(b > c){
                System.out.printf("%d %d %d\n",c,b,a); 
            }

            else if(a < c){
                System.out.printf("%d %d %d\n",b,a,c);
            }

            else{
                System.out.printf("%d %d %d\n",b,c,a);
            }

        }

        stdIn.close();

    }


}
