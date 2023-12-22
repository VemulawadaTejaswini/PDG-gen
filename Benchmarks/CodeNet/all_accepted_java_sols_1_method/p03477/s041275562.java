  import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int e;
        int f;
        e = A+B;
        f = C+D;
        if(e>f){
            System.out.println("Left");
        }
        else if(e==f){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Right");
        }

    }
}