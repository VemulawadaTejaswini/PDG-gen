import java.util.*;
class Main{
public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  String s=sc.next();
  if(s.equals("SSS")){
  System.out.println(0);
  }
  if(s.equals("SSR")){
  System.out.println(1);
  }
  if(s.equals("SRS")){
  System.out.println(1);
  }
  if(s.equals("SRR")){
  System.out.println(2);
  }
  if(s.equals("RSS")){
  System.out.println(1);
  }
  if(s.equals("RSR")){
  System.out.println(1);
  }
  if(s.equals("RRS")){
  System.out.println(2);
  }
  if(s.equals("RRR")){
  System.out.println(3);
  }
}
}
