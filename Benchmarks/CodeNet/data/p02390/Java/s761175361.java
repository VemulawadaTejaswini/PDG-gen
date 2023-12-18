import java.io.*;

class Main{
  public static void main(String[] args) {

    int a = Integer.parseInt(args[0]);
    int h = a / 3600;
    int m = a % 3600 / 60;
    int s = a % 3600 % 60;

    System.out.println(h+":"+m+":"+s);
  }
}