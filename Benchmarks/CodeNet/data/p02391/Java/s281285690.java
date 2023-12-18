import java.util.Scanner;


public class Main {
    static Scanner scanner;
    static int getInt(){
        return Integer.parseInt(scanner.next());
    }
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int a = getInt();
        int b = getInt();
        if(a < b){
            System.out.println("a < b");
        }
        else if(a > b){
            System.out.println("a > b");
        }
        else{
            System.out.println("a == b");
        }
    }
}

