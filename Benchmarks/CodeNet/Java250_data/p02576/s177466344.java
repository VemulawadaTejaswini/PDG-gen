import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int X = scan.nextInt();
    int T = scan.nextInt();
    int ans = 0;
    if(N % X == 0){
      ans = (N / X) * T;
    }
    else{
      ans = (N / X);
      ans = (ans + 1 ) * T;
    }
    System.out.println(ans);
  }
}
     
     