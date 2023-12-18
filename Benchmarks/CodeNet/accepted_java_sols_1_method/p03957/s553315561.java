import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        boolean flag1 = false;
        boolean flag2 = false;
        for (int i = 0; i < s.length(); i++){
            if (!flag1){
                if (s.charAt(i) == 'C'){
                    flag1 = true;
                }
            } else if (!flag2){
                if (s.charAt(i) == 'F'){
                    flag2 = true;
                }
            }
        }
        if (flag1 && flag2){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}