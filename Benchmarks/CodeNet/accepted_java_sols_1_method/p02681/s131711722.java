import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        String T = sc.next();
    
        String regaxT = String.format("%s.", S);

        if(T.matches(regaxT)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}