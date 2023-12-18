import java.util.*;
class Main{
public static void main(String[] args) {
  Scanner reader =new Scanner (System.in);
  int k =reader.nextInt();
  String s =reader.next();
  if(k>=s.length())
  {
    System.out.println(s);
  }
  else{

  String x=s.substring(0,k);

System.out.println(x+"...");
}


}
}