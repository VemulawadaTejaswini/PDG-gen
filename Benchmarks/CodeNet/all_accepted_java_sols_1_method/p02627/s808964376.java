import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        char moji = sc.next().charAt(0);

        String ans = null;

        if(Character.isUpperCase(moji)){
            ans = "A";
        }else {
            ans = "a";
        }

        System.out.println(ans);

    }
}
