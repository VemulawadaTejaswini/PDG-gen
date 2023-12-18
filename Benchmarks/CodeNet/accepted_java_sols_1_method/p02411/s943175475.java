import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int s = a+b;

            if(a<0 && b<0 && c<0) System.exit(0);

            if(a<0 || b<0 || s<30){
                System.out.println("F");
            }else if(s>=80){
                System.out.println("A");
            }else if(65<=s && s<80){
                System.out.println("B");
            }else if(50<=s && s<65){
                System.out.println("C");
            }else{
                if(c>=50){
                    System.out.println("C");
                }else{
                    System.out.println("D");
                }
            }
        }
    }
}
