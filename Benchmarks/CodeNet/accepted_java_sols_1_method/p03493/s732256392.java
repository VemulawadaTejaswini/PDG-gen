import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int i;
    int count=0;
    sc.close();

    for(i=0;i<3;i++){
      if(s.charAt(i)=='1'){
        count++;
      }
    }
    System.out.println(count);
  }
}