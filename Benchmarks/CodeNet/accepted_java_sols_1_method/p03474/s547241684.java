import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int A =sc.nextInt();
        int B =sc.nextInt();
        String S =sc.next();
        boolean flag = true;
        String[] w =S.split("-");
        if (w.length != 2){
            flag = false;
        }else{
            if(w[0].length() !=A){
                flag = false;
            }
            if(w[1].length() != B){
                flag = false;
            }
        }
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
