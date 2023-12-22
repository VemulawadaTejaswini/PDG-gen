import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        String s = stdIn.nextLine();
        if(s.equals("ABC")){
            System.out.println("ARC");
        }else if(s.equals("ARC")){
            System.out.println("ABC");
        }
    }
}
