import java.util.Scanner;

public class Main27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int m = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            if (m == -1 && f == -1 && r==-1) {
                break;
            }else if(m==-1 || f==-1){
                System.out.println("F\n");
            }else if(80<=(m+f)){
                System.out.println("A\n");
            }else if(65<=(m+f)){
                System.out.println("B\n");
            }else if(50<=(m+f)){
                System.out.println("C\n");
            }else if(30<=(m+f)){
                if (50 <= r) {
                    System.out.println("C\n");
                } else {
                    System.out.println("D\n");
                }
            }else if((m+f)<30){
                System.out.println("F\n");
            }
        }
    }



}

