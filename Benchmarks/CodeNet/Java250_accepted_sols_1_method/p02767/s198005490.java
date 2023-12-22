import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
 
public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    List<Integer> xList = new ArrayList<>();
    for(int i = 0;i < N;i++){
      xList.add(scanner.nextInt());
    }
    int maxv = 0;
    for(int v : xList){
      if(v > maxv)maxv = v;
    }
    List<Integer> sumList = new ArrayList<>();
      for(int k = 0;k < maxv + 10;k++){
      int sum = 0;
      for(int x : xList){
        sum = sum + (int)Math.pow((x - k),2);
      }
        sumList.add(sum);
    }
    int miniSum = sumList.get(0);
    for(int sum : sumList){
     if(sum < miniSum)miniSum = sum;
    }
    System.out.println(miniSum);
  }
}