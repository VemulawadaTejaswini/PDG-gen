import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int s=sc.nextInt();
  	int h=(s/500)*1000+((s%500)/5)*5;
    System.out.println(h);
    
  }
}