import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int C = Integer.parseInt(sc.next());
        int D = Integer.parseInt(sc.next());
        int judge = A+B-C-D;
        if(judge > 0){
            System.out.println("Left");
        }else if(judge == 0){
            System.out.println("Balanced");
        }else{
            System.out.println("Right");
        }
    }  
}