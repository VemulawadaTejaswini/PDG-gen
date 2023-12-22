import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long X=sc.nextLong();
     long nokori=X%500;
     long first=X/500;
     long second=nokori/5;

      System.out.println(1000*first+5*second);
        }
      }
