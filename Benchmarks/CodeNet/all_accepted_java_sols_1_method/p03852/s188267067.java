import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String c = sc.next();

        if(c.equals("a") || c.equals("i") || c.equals("u") || c.equals("e") || c.equals("o")){
            System.out.println("vowel");
        }
        else{
            System.out.println("consonant");
        }
    }
}