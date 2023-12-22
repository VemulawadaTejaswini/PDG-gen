import java.util.Scanner;

public class Main{
  static String[] str;
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    str = A.split("/",0);
    int Toshi = Integer.parseInt(str[0]);
    int Tuki = Integer.parseInt(str[1]);
    int Aate = Integer.parseInt(str[2]);

    if(Toshi>2019){
      System.out.println("TBD");
    }
    else if(Tuki>4){
      System.out.println("TBD");
    }
    else if(Aate>30){
      System.out.println("TBD");
    }
    else{
      System.out.println("Heisei");
    }
  }
}
