import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args) {

  Scanner scan = new Scanner(System.in);

  int n = scan.nextInt();
  int numbers[]  = new int[n];
  for(int i=n;i>=0;i--){
    numbers[i] = scan.nextInt();
}
  for(int j=n-1;j>=0;j--){
    System.out.println(numbers[j] + " ");
  }
  }

}