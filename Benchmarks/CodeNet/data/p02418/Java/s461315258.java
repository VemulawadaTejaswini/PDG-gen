import java.util.Scanner;
  
class Main{
  public static void main(String[] arg){
    
    Scanner in = new Scanner(System.in);

    String s = in.nextLine();
    String p = in.nextLine();

    String tmp = s + s.substring(0, p.length());

    if(tmp.indexOf(p) != -1)
        System.out.println("Yes");
    else
        System.out.println("No");

  }
}