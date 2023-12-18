import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        if(S.charAt(2) == S.charAt((3)) && S.charAt(4) == S.charAt(5)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}