import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int sunukes[] = new int[N];
    
    for(int i = 0;i < K;i++){
      int d = scanner.nextInt();
      for(int j = 0;j < d;j++){
        int a = scanner.nextInt() - 1;
        sunukes[a]++;
      }
    }
    int sum = 0;
    for(int i = 0;i < sunukes.length;i++){
      if(sunukes[i] == 0){
      	sum++;
      }
    }
    System.out.println(sum);
  }
}