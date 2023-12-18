import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    int num[] = new int[4]; 
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < 4; i++){
        num[i] = Integer.parseInt(scanner.next());
    }
    scanner.close();
    long max = -1000000000000000000;
    long tmp = 0;

    for (int j = 0; j < 2; j++){
      for (int k = 2; k < 4; k++){
        tmp = (long)num[j] * (long)num[k];
        System.out.println(num[j] +":"+ +num[k]);
        System.out.println(tmp);
        if (max < tmp){
          max = tmp;
        }
      }
    }
    System.out.println(max);
  }
}