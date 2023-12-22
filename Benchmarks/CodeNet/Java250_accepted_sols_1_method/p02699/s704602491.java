import java.util.*;
class Main{
public static void main(String[] args) {
  Scanner reader =new Scanner (System.in);
  int i=reader.nextInt();
  int d=reader.nextInt();
  if(i<=d)
  {
    System.out.println("unsafe");
  }else
    System.out.println("safe");
}
}
