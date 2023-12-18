import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    
    int n=sc.nextInt();
    int give=n/15;
    int x=n*800;
    int y=give*200;
    System.out.println(x-y);
    
  }
}