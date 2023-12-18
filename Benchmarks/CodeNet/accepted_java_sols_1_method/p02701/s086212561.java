import java.util.*;
class Main{
public static void main(String[] args) {
  Scanner reader =new Scanner (System.in);
  int n=reader.nextInt();
  HashSet<String> a=new HashSet<String>();

  for(int i=0;i<n;i++)
  {
    a.add(reader.next());
  }
  System.out.println(a.size());




}
}