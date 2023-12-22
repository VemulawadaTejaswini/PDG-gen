import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x=sc.nextInt();
    int y=sc.nextInt();
    String ans="No";
    for(int i=0,j=x;i<=x&&j>=0&&(i+j)==x; i++,j--){
      if(i*4+j*2==y){
        ans="Yes";
        break;
      }
    }
    System.out.println(ans);
    System.out.flush();
    sc.close();
  }
}
