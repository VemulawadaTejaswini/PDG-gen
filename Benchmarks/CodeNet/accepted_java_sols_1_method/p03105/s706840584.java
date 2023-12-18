import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int razon = B / A;
        if(razon > C){
            System.out.println(C);
        }else{
            System.out.println(razon);
        }

    }
}
