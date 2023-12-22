import java.util.*;

class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  char ch = sc.next().charAt(0);
  int asciival = ch -'A';
  if(0 <= asciival && asciival <= 26)
    System.out.println("A");
  else
    System.out.println("a");
  }
}
