import java.util.Scanner;
public class Main{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int ans = -1;
    int ax;
    int bx;
    for(int i = 1; i <= 1000; i++){
       ax = (int) (i*0.08);
       bx = (int) (i*0.1);
       if(ax == a && bx == b){
         ans = i;
         break;
       }
    }
    System.out.println(ans);
  }
}