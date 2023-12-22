import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner str = new Scanner(System.in);
        String S = str.next();
        String T = str.next();

        int A = str.nextInt();
        int B = str.nextInt();

        String U = str.next();

        if(S.equals(U)){
            A -= 1;
        }
        else{
            B -= 1;
        }

        System.out.println(A + " " + B);
    }
}