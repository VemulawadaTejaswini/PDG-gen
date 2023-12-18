import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        String str = scanner.nextLine();

        if(Character.isUpperCase(str.charAt(0))){
            System.out.println("A");
        }else{
            System.out.println( "a" );
        }
    }

}
