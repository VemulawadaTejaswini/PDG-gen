import java.util.Scanner;

public class Main {

    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int A = Integer.parseInt(sc.next());
            int B = Integer.parseInt(sc.next());
            int C = Integer.parseInt(sc.next());
            int D = Integer.parseInt(sc.next());

            while(A > 0 && C > 0){
                C-=B;
                if(C > 0){
                    A-=D;
                }
            }

            if(C <= 0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

            sc.close();
    }

}