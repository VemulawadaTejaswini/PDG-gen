// Problem - Uppercase and Lowercase

import java.util.Scanner;
import java.lang.Character;

class Main{
  public static void main(String[] args){
    // Config
    Scanner sc = new Scanner(System.in);

    // Input
    String str = sc.nextLine();
    String ans = "";
    for(int i=0; i<str.length(); i++){
      char tmp = str.charAt(i);
      if(Character.isUpperCase(tmp)){
        tmp = Character.toLowerCase(tmp);
      }else{
        tmp = Character.toUpperCase(tmp);
      }
      ans += tmp;
    }

    // Output
    System.out.println(ans);
  }
}

