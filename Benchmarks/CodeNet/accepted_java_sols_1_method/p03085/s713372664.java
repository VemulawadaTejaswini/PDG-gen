import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        
        //int a = stdIn.nextInt();
        //int b = stdIn.nextInt();
        //int n = stdIn.nextInt();
        //int k = stdIn.nextInt();
        String s = stdIn.next();
        
        switch(s){
            case "A":
                System.out.println("T");
                break;
            case "T":
                System.out.println("A");
                break;
            case "G":
                System.out.println("C");
                break;
            case "C":
                System.out.println("G");
                break;
            
        }
        
        //System.out.println();
        //System.out.print();
    }
}
