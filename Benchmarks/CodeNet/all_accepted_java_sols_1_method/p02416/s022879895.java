import java.util.Scanner;
class Main{
 public static void main(String[] args){
  String s;
  int i,g;
  Scanner sc = new Scanner(System.in);
  while(true){
   s=sc.next();
   if(s.equals("0"))break;
   g=0;
   for(i=0;i<s.length();i++)
    g+=s.charAt(i)-48;
   System.out.println(g);
  }
 }
}
