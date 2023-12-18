import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] b = a.split(" ");
        int numA = Integer.parseInt(b[0]);
        int numB = Integer.parseInt(b[1]);
        int numC = Integer.parseInt(b[2]);
        if(numA + numB >= numC){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}