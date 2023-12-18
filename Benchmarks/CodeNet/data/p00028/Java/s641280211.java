import java.util.Scanner;

class Main {
  public static void main(String[] args){
    int[] m = new int[110];
    input(m);
    printMode(m);
  }
  private static void input(int[] m){
    Scanner cin = new Scanner(System.in);
    while (cin.hasNext()){
      m[cin.nextInt()]++;
    }
  }

  private static void printMode(int[] m){
    int max = 0;
    for (int i = 1; i < 101; i++){
      max = Math.max(max, m[i]);
    }
    for (int i = 1; i < 101; i++){
      if (m[i] == max){
        System.out.println(i);
      }
    }
  }
}