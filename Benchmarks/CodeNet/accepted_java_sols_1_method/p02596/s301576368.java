import java.util.*;
import java.io.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int x = 7%k;
    int count = 1;
    while(x!=0 && count<=(int)(1e6+1)) {
        x = ((x*10)%k + 7)%k;
        count++;
    }
    if(count>=(int)(1e6+1)) System.out.println(-1);
    else System.out.println(count);
  }
}