import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str1=sc.nextLine();
    String str2=sc.nextLine();
    int m=str1.length();
    int n=str2.length();
    String new_str2=str2.substring(0,m);
    if(str1.equals(new_str2)){
      if(n==m+1){
          System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }else{
      System.out.println("No");
    }
  }
}
