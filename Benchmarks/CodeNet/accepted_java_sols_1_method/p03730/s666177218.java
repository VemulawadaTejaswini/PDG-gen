import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int x = sc.nextInt();
    boolean can =false;
    for(int i = 1; i <= b; i++){
        if( (i * a) % b == x) {
          can =true;
        }
    }
    if(can){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }

  }
}
