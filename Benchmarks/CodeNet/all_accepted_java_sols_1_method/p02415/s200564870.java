import java.util.Scanner;
 
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String str2 = "";
    for(int i = 0; i < str.length(); i++){
      char c = str.charAt(i);
      if('A' <= c && c <= 'Z'){
        c += 'a' - 'A';
      }else if('a' <= c && c <= 'z'){
        c += 'A' - 'a';
      }
      str2 += String.valueOf(c);
    }
    System.out.println(str2);
  }
}
