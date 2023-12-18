import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
String po=sc.next().replace("11","").replace("22","").replace("33","").replace("44","").replace("55","").replace("66","").replace("77","").replace("88","").replace("99","").replace("00","");
  System.out.println((po.length()==4)?"Good":"Bad");
}
}