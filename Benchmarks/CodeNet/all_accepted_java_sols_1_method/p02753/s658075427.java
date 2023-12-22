import java.util.Scanner;
import java.util.Arrays;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
String s=scan.next();
String[] ss=s.split("");
  
if(!(ss[0].equals(ss[1]))&&ss[1].equals(ss[2])){
  System.out.println("Yes");
}else if(ss[0].equals(ss[1])&&!(ss[1].equals(ss[2]))){
  System.out.println("Yes");
}else if(!(ss[0].equals(ss[1]))&&!(ss[1].equals(ss[2]))){
  System.out.println("Yes");
}else{
  System.out.println("No");
}
  

}
}