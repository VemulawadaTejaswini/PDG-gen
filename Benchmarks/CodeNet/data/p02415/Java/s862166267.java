import java.util.Scanner;

class Main {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String input = sc.nextLine();
       String output = "";
       int i;
       Character c;
       for (i = 0; i < input.length(); i++) {
           c = input.charAt(i);
           if(c >= 'A' && c <= 'Z') output = output.concat(c.toString().toLowerCase());
           else if(c >= 'a' && c <= 'z') output = output.concat(c.toString().toUpperCase());
           else output = output.concat(c.toString());
       }
       System.out.println(output);
   }
}
