import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        String t = sc.next();
        
        boolean yes = false;
        for(int i = 0; i < s.length(); i++){
            s = s.substring(s.length()-1) + s.substring(0, s.length()-1);
            if(s.equals(t)) yes = true;
        }
        if(yes){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}