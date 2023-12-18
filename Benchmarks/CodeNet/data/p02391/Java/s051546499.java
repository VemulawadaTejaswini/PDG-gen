import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        String ab = stdIn.nextLine();
        
        int a = Character.getNumericValue(ab.charAt(0));
        int b = Character.getNumericValue(ab.charAt(2));
        
        if (a > b) {
            System.out.println(a+" > "+b);
        } else if (a < b) {
            System.out.println(a+" < "+b); 
        } else if (a == b) {
            System.out.println(a+" == "+b);
        }
    }
}