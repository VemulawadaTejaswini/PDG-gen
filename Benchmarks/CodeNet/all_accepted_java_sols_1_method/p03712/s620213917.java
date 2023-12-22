import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
  int H = sc.nextInt();
  int W = sc.nextInt();
  String[] s = new String[H];
  for(int i = 0;i < W+2;i++)System.out.print("#");
  System.out.println("");
  for(int i = 0;i < H;i++){
    s[i] = sc.next();
    System.out.println("#" + s[i] + "#");
  }
  for(int i = 0;i < W+2;i++)System.out.print("#");
  System.out.println("");
}}