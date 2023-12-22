import java.util.*;                                                                                  

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 20000; i++) {
          String line = sc.nextLine();
          String[] l = line.split(" ");
          int a = Integer.parseInt(l[0]);
          String op = l[1];
          int b = Integer.parseInt(l[2]);

          if(op.equals("?")) {
            break;
          } else if(op.equals("+")) {
            System.out.println(a + b); 
          } else if(op.equals("-")) {
            System.out.println(a - b); 
          } else if(op.equals("*")) {
            System.out.println(a * b); 
          } else if(op.equals("/")) {
            System.out.println(a / b); 
          }   
        }   
    }   
}