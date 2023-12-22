import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String in = sc.next();
    int out = 0;
    for(int i = 0; i < 3; i++){
      if(in.charAt(i) == 'o')out++;
    }
    System.out.println(700 + 100 * out);
  }
}
