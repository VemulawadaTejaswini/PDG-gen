import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String N = in.next();
        int i = 0, j = N.length() - 1;
        double sum = 0;
        while(i < j){
            sum += (N.charAt(i++) - 48) + (N.charAt(j--) - 48);
        }
        if(N.length() % 2 == 1){
            sum += (N.charAt(i) - 48);
        }
        if(sum % 9 == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
