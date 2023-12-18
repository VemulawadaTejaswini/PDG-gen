import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String present = sc.nextLine();
        if(present.startsWith("YAKI")) System.out.println("Yes");
        else System.out.println("No");
    }
}