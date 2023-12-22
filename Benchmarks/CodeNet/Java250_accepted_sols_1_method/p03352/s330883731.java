import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int max = 1;

    for(int b=1;b<32;b++){
      for(int p=2;p<10;p++){
        double exp = Math.pow(b,p);
        if(exp>X){
          break;
        }
        if(max < exp){
          max = (int)exp;
        }
      }
    }
    System.out.println(max);
  }
}
