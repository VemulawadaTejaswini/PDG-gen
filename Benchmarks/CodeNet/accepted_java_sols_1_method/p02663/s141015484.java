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
    int hour = scan.nextInt();
    int minute = scan.nextInt();
    int Hour = scan.nextInt();
    int Minute = scan.nextInt();
    int K = scan.nextInt();
    int start, finish, sum;
    start = hour * 60 + minute;
    finish = Hour * 60 + Minute;
    sum = finish - start - K;
    System.out.println(sum);
  }
}
