import java.util.Scanner;
import java.io.*;
import java.lang.Integer;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String token = scan.next();
    long num = Long.parseLong(token);
    int valLength = String.valueOf(num).length();
    int sum = 0;

    for(int i = 0;i< valLength; i++){
    int temp = token.charAt(i);
    sum += temp-48;
    }
    System.out.println(sum);
  }
}