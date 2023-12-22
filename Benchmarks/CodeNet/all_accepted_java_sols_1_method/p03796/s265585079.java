import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int mod = 1000000007;
    long power = 1;
    for (int i = 1; i <= n; i++) {
      power = (power * i) % mod;
    }
    System.out.println(power);

  }
}
