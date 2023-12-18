import java.util.*;                                                                                  

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] l = line.split(" ");
        int a = Integer.parseInt(l[0]);
        int b = Integer.parseInt(l[1]);
        int c = Integer.parseInt(l[2]);

        if(a < b && b < c) {
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }   
    }   
}