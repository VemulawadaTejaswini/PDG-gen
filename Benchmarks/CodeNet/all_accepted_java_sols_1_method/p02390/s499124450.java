import java.util.Scanner;

class Main {
public static void main(String[] args){
  Scanner stdIn = new Scanner(System.in);
  int S = stdIn.nextInt();
  int m;
  int h;
  h = S/3600;
  S = S%3600;
  m = S/60;
  S = S%60;
  System.out.println(h + ":"+ m + ":"+ S);
  
}
  
}
