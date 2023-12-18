//import java.io.File;
import java.util.Scanner;

public class Main{
  public static void main(String[] args) throws Exception {
    //Scanner scan = new Scanner(new File("in.txt"));
    Scanner scan = new Scanner(System.in);

    char[][] list = new char[][] {
      {'.',',','!','?',' '},
      {'a','b','c'},
      {'d','e','f'},
      {'g','h','i'},
      {'j','k','l'},
      {'m','n','o'},
      {'p','q','r','s'},
      {'t','u','v'},
      {'w','x','y','z'}
    };

    int input1 = scan.nextInt();

    for(int cases = 0; cases < input1; cases++) {
      char[] numbers = scan.next().toCharArray();
      StringBuilder sb = new StringBuilder();
      for(int ite = 0; ite < numbers.length; ite++) {
        int count = -1;
        int num = numbers[ite]-'1';

        while(numbers[ite] != '0' && ite < numbers.length-1) {
          ite++;
          count++;
        }

        if(count != -1) sb.append(list[num][count%list[num].length]);
      }
      System.out.println(sb.toString());
    }
  }
}