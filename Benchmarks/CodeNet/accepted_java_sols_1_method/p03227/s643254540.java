import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (str.length() == 2)
            System.out.println(str);
        else
            for(int i=0; i<=2; i++){
            	System.out.print(str.charAt(2-i));
            }
            
    }
}