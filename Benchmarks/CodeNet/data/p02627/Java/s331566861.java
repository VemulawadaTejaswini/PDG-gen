import java.util.*;

class Main {
  Scanner sc = new Scanner(System.in);
  char ch;
  ch = sc.nextChar();
  int asciival = (int)ch;
  if(asciival >= 65 && asciival <= 90)
    System.out.println("A");
  else
    System.out.println("a");
}
