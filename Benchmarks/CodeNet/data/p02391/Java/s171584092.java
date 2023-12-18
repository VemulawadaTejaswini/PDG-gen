import java.util.*;

public class Main {                                                                                  
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] l = line.split(" ");
        int a = Integer.parseInt(l[0]);
        int b = Integer.parseInt(l[1]);

        if(a < b) {
          System.out.println("a<b");
        } else if(a > b) {
          System.out.println("a>b");
        } else {
          System.out.println("a==b");
        }   

    }   
}