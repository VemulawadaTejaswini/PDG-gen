import java.util.Scanner;

class Main{
  public static void main(String []a){
    Scanner sc=new Scanner(System.in);
    char ch=sc.next().charAt(0);
    
    if(ch>90){
      System.out.println("a");
    }
    else{
      System.out.println("A");
    }
  }
}