import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str1=sc.nextLine();
    String str2=sc.nextLine();
    int m=str1.length();
    int n=str2.length();
    if(n==m+1){
      if(str2.contains(str1)){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }else{
      System.out.println("No");
    }
  }
}