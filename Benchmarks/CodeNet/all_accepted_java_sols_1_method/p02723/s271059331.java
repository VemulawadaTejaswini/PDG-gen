import java.util.*;

class Main {
    private static Scanner sc;

    public static void main(final String[] args) {
        sc = new Scanner(System.in);
        String a = sc.next();
        if(a.substring(2,3).equals(a.substring(3,4)) && 
           a.substring(4,5).equals(a.substring(5,6)))System.out.println("Yes"); 
        else System.out.println("No");
    }
}






