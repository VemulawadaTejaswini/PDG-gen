import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char c = sc.next().charAt(0);
    if(c == 'A'){
      System.out.println("T");
    }else if(c == 'T'){
      System.out.println("A");
    }else if(c == 'C'){
      System.out.println("G");
    }else{
      System.out.println("C");
    }
  }
}