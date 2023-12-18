import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    n = n % 1000;

    n = (1000 - n) % 1000;

    System.out.println(n);

  }
}