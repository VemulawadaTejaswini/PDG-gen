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
    int n = scan.nextInt();
    if (n<=1000) {
      System.out.println(1000-n);
    }
    else if (n<=2000) {
      System.out.println(2000-n);
    }
    else if (n<=3000) {
      System.out.println(3000-n);
    }
    else if(n<=4000){
      System.out.println(4000-n);
    }
    else if (n<=5000) {
      System.out.println(5000-n);
    }
    else if (n<=6000) {
      System.out.println(6000-n);
    }
    else if(n<=7000){
      System.out.println(7000-n);
    }
    else if (n<=8000) {
      System.out.println(8000-n);
    }
    else if (n<=9000) {
      System.out.println(9000-n);
    }
    else{
      System.out.println(10000-n);
    }
  }
}
