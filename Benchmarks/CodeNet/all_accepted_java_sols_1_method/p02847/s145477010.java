import java.util.Scanner;
 public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
       
      String a ="SUN";
      String b ="MON";
      String c ="TUE";
      String d ="WED";
      String e ="THU";
      String f ="FRI";
      String g ="SAT";
      
      if(S.equals(a)){
      System.out.println("7");
      }
      else if(S.equals(b)){
      System.out.println("6");
      }
      else if(S.equals(c)){
      System.out.println("5");
      }
      else if(S.equals(d)){
      System.out.println("4");
      }
      else if(S.equals(e)){
      System.out.println("3");
      }
      else if(S.equals(f)){
      System.out.println("2");
      }
      else if(S.equals(g)){
      System.out.println("1");
      }
    }
 }