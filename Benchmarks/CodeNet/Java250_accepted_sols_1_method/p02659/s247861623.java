import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = Long.parseLong(sc.next());
    char[] b = sc.next().toCharArray();
    int c = 100*(b[0]-'0')+10*(b[2]-'0')+b[3]-'0';
    System.out.println(a*c/100);
  }
}