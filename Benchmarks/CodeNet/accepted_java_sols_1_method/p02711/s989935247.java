import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        String s = Integer.toString(n);
        boolean flag = false;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '7') flag = true;
        }
        System.out.println(flag ? "Yes" : "No");
    }
}