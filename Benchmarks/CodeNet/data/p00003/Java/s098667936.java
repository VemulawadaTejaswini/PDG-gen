import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int n = Integer.parseInt(s.next());
    for (int j=0;j<n;j++){
        int a = Integer.parseInt(s.next());
        int b = Integer.parseInt(s.next());
        int c = Integer.parseInt(s.next());
        if((a*a)+(b*b)==(c*c) || (b*b)+(c*c)==(a*a) || (c*c)+(a*a) == (b*b)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
  }
}
