import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);

  int n = scan.nextInt();
  int numbers[];
  int temp;
  for(int i=1;i<=n;i++){
    numbers[i] = {scan.nextInt();}
  }
  for(int j=1;j<=n/2;j++){
    temp = numbers[j];
    numbers[j] = numbers[n-j];
    numbers[n-j] = temp;
  }
  }
}