import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String L = sc.nextLine();
        
        switch(L){
            case "SSS":
                System.out.println("0");
                break;
            case "SSR":
                System.out.println("1");
                break;
            case "SRS":
                System.out.println("1");
                break;
            case "RSS":
                System.out.println("1");
                break;
            case "RRS":
                System.out.println("2");
                break;
            case "RSR":
                System.out.println("1");
                break;
            case "SRR":
                System.out.println("2");
                break;
            case "RRR":
                System.out.println("3");
                break;
        }
    }
}







