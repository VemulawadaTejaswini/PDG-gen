import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int n = sc.nextInt();
    int[] array = new int[102];
    for(int i = 0; i < n; i++){
      array[sc.nextInt()]++;
    }
    int distance = 0;
    while((x + distance) <= 100){
      if(x - distance == 0){
        System.out.println(x - distance);
        return;
      }
      if(x + distance == 101){
        System.out.println(x + distance);
        return;
      }
      if(array[x - distance] == 0){
        System.out.println(x - distance);
        return;
      } else if(array[x + distance] == 0){
        System.out.println(x + distance);
        return;
      }
      distance++;
    }
    //System.out.println(Math.abs(x + 1) > Math.abs(101 - x) ? 101 : 0);
  }
}