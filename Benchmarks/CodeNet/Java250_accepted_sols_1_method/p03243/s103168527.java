
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner (System.in);

    int num = cin.nextInt();
    int numTemp = 0;
    for (int i=1;i<=9;i++){
      numTemp = i+i*10+i*100;
      if (numTemp >= num) break;
    }
    System.out.println(numTemp);

  }


}