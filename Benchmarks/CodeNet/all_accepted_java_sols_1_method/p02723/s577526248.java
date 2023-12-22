import java.util.Scanner;
import java.util.Arrays;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
String s=scan.next();
String[] ss=s.split("");
  
if(ss[2].equals(ss[3])&&ss[4].equals(ss[5])){
System.out.println("Yes");
}else{
System.out.println("No");
}

}
}