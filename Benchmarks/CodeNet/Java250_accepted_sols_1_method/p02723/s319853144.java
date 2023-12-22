import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String coffee = "coffee";
        int flag = 0;

        String S = sc.next();
        if(S.substring(2,3).equals(S.substring(3,4)) && S.substring(4,5).equals(S.substring(5,6))){
        }else{
            flag = 1;
        }
        if(flag == 1){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}