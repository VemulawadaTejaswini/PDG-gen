import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;
        String T="";
        String S = scan.nextLine();
        for(i=0; i<S.length(); i++){
           T=T+"x";
        }
        System.out.println(T);
    }
}