import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        if(Character.isUpperCase(c)){
            System.out.println("A");
        }else{
            System.out.println("a");
        }
    }
}
