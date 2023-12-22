
import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int A= in.nextInt();
        int B= in.nextInt();

        if(A>=13)
            System.out.println(B);
        else
            if(A>=6 && A<=12){
            B=B>>1;
                System.out.println(B);
            }
            else{
                System.out.println(0);
            }

    }
}
