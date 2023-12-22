
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);

    int n = cin.nextInt();
    int[] diff = new int[n];
    int[] value = new int[n];
    for (int i=0;i<n;i++) {
      value[i] = cin.nextInt();
    }
    for (int i=0;i<n;i++) {
      diff[i] = value[i] - cin.nextInt();
    }
    
//    int[] diff = new int[n];
    int sum = 0;
    
    for (int i:diff) {
      if (i>0) 
        sum+=i;
    }
    
    System.out.println(sum);
  }

}