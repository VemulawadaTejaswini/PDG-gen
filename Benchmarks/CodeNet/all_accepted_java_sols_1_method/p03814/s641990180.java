import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int top=0;
    int last=0;
    for (int i = 0; i < s.length(); i++){
      if (s.charAt(i) == 'A'){
        top = i;
        break;
      }
    }
    for (int j = s.length() - 1; j > top ; j--){
      if(s.charAt(j) == 'Z'){
        last = j;
        break;
      }
    }
    System.out.println(last - top + 1);
  }
}