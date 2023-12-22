import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int num = Integer.parseInt(str);
        int b = 0;
        char[] ch = str.toCharArray();
        for(int i = 0; i < str.length(); i++){
            int a = Character.getNumericValue(ch[i]);
            b += a;
        }
        if(num % b == 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}