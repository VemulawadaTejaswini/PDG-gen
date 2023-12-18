import java.util.Scanner;

public class A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        System.out.print(S);
        if (S.charAt(S.length()-1)=='s') {
            System.out.println("es");
        }else {
            System.out.println("s");
        }
    }
}
