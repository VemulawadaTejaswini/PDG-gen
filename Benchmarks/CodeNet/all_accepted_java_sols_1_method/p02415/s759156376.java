import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    String s2=s1.toLowerCase();
    String s3=s1.toUpperCase();
    for(int i=0;i<s1.length();i++){
      if(s1.charAt(i)==s2.charAt(i)){
        System.out.print(s3.charAt(i));
      }else if(s1.charAt(i)==s3.charAt(i)){
        System.out.print(s2.charAt(i));
      }
    }
    sc.close();
    System.out.print("\n");
  }
}
