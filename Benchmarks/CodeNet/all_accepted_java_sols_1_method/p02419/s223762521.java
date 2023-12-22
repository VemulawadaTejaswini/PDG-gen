import java.util.Scanner;
  
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String strW = sc.next();
    int x = 0;
  
    for(int i = 0; ; i++){
      String str = sc.next();
      String str2 = "";
      for(int n = 0; n < str.length(); n++){
        char c = str.charAt(n);
        if('A' <= c && c <= 'Z'){
          c += 'a' - 'A';
        }
        str2 += c;
      }
      if(str2.equals(strW)){
        x += 1;
      }
      if(str.equals("END_OF_TEXT")){
        break;
      }
    }
  
    System.out.println(x);
  }
}
