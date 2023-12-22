import java.util.*;

class Main{
 public static void main(String[] args){
  Scanner s = new Scanner(System.in);

while(s.hasNext()){
 int a = s.nextInt();
 int b = s.nextInt();
 a += b;
 String c = String.valueOf(a);
 System.out.println(c.length());
  }
 }
}