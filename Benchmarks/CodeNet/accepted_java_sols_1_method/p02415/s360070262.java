import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String ch = sc.nextLine();
    char[] c = new char[ch.length()];

    for(int i = 0; i < ch.length() ; i++){
      c[i] = ch.charAt(i);
    }
    for(int i = 0; i < c.length ; i++){
      if(Character.isUpperCase(c[i])){ c[i] = Character.toLowerCase(c[i]);}
      else if(Character.isLowerCase(c[i])){ c[i] = Character.toUpperCase(c[i]);}
      System.out.print(c[i]);
    }
    System.out.println("");
  }
}

