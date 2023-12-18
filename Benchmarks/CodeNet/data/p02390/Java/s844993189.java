import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int seconds=sc.nextInt();
    System.out.println(seconds/3600+":"+seconds/60%60+":"+seconds%60);
  }
}
