import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int max = 3;
    int num[] = new int[max];
    for(int i = 0; i < max; i++){
      num[i] = sc.nextInt();
    }

    for(int i = max - 1; i > 0; i--){
      for(int j = 0; j < i; j++){
        if(num[j] > num[j + 1]){
          int a = num[j];
          num[j] = num[j + 1];
          num[j + 1] = a;
        }
      }
    }

    for(int i = 0; i < max; i++){
      System.out.print(num[i] + " ");
    }
    System.out.print("\n");
  }
}