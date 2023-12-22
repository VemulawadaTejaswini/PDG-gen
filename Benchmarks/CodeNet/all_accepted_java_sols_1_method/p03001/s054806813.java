import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int w = sc.nextInt();
    int h = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    int half = 0;
    double s = 0;
    if((w==2*x)&&(h==2*y)){
      half=1;
    }
    s=0.5*w*h;
    System.out.println(s+" "+half);
  }
}