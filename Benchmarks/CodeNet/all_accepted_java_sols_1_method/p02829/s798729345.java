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
    int A = scan.nextInt();
    int B = scan.nextInt();
    if (A + B == 3) {
      System.out.println(3);
    }
    else if (A + B == 5) {
      System.out.println(1);
    }
    else{
      System.out.println(2);
    }
  }
}

