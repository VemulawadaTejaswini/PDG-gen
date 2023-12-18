import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(true){
      String line = sc.nextLine();
      int a = line.length();
      char num;
      int Sum=0;
      int i=0;
      while(i<a){
        num = line.charAt(i);
        Sum += (num-'0');
        i++;
      }if(line.charAt(0)=='0'&&a==1) break;
      System.out.println(Sum);
    }
    sc.close();
  }
}
