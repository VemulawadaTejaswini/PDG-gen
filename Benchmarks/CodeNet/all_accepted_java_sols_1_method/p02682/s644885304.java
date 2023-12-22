import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int maxIndex = scan.nextInt();
    
    int index = 0;
    int sum = 0;
    for(int i = 0;i < a && index < maxIndex;i++,index++){
      sum += 1;
    }
    for(int j = 0;j < b && index < maxIndex;j++,index++){
    }
    for(int k = 0;k < c && index < maxIndex;k++,index++){
        sum -= 1;
    }
    System.out.println(sum);
  }
}