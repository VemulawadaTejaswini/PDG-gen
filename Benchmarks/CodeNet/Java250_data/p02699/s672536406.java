import java.util.*;
public class Main{
  public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int O = scan.nextInt();
        int ans = O-H;
        if(ans>=0){
            System.out.println("unsafe");
        }
        else {
            System.out.println("safe");
        }
  }
}