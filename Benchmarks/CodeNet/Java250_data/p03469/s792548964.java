import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    String date = sc.next();
    if(date.contains("2017") == true)
          System.out.println(date.replace("2017", "2018")); 
  }
}