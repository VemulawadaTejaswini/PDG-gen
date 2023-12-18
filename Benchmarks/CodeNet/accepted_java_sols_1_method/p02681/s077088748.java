import java.util.Scanner;

class Main {
  public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  String s = scan.nextLine();
  String t = scan.nextLine();
  if(t.substring(0,t.length()-1).equals(s)){
    System.out.println("Yes");
  } else {
    System.out.println("No");
  }
  
  
  }


}