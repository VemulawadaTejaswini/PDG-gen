import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();
        String[] array = str.split(" ");
      String a = array[0];
      String b = array[1];
      Integer ai = Integer.parseInt(a);
      Integer bi = Integer.parseInt(b);
      if( ai*bi%2==0){
        System.out.println("Even")    ;
      }
      else{
        System.out.println("Odd")    ;
      }
    }
}
