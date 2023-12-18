import java.util.*;

class Main {
  Scanner sc = new Scanner(System.in);
  char ch;
  ch = sc.nextChar();
  int asciival = ch - 'A';
  if(asciival >= 0 && asciival <= 26)
    System.out.println("A");
  else
    System.out.println("a");
}