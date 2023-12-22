import java.util.StringJoiner;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String line = sc.nextLine();

String line2 = sc.nextLine();
String column[] = line2.split("");
String addword = column[line2.length() -1];
String newID = String.join("" , line , addword);

if(line2.equals(newID)){
  System.out.println("Yes");
}else{
  System.out.println("No");
}

  
}
}