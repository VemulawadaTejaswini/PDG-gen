import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        while(true){

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a == -1 || b == -1){
                if((a==-1&&b==-1) && c==-1){
                    break;
                }else{
                    System.out.printf("F\n");
                }
            }else if((a+b) >= 80){
                System.out.printf("A\n");
            }else if((a+b)>= 65){
                System.out.printf("B\n");
            }else if((a+b) >= 50){
                System.out.printf("C\n");
            }else if((a+b) >= 30){
                if(c > 50){
                    System.out.printf("C\n");
                }else{
                    System.out.printf("D\n");
                }

            }else{
                System.out.printf("F\n");
            }


        }
    }

}