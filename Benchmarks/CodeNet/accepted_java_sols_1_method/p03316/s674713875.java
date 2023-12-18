import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String n=sc.next();
    int a=0;
    for(int i=0;i<n.length();i++)a+=Integer.parseInt(n.substring(i,i+1));
    System.out.println(Integer.parseInt(n)%a==0?"Yes":"No");
  }
}