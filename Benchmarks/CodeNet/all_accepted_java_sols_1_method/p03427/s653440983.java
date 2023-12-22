import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        boolean b = true;
        for(int i=1; i<n.length(); i++){
            if(n.charAt(i) != '9') b = false;
        }


        if(b){
            System.out.println((int)n.charAt(0) - 48 + (n.length()-1)*9);
        }else{
            System.out.println((int)n.charAt(0) - 48 + (n.length()-1)*9 - 1);
            
        }
    }
}