import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int num[] = new int[5];

    for(int i=0; i<=4; i++){
      num[i] = scanner.nextInt();
    }
    int k = scanner.nextInt();

    for(int i=0; i<num.length; i++){
      if(num[num.length-i-1] - num[i] > k){
        System.out.println(":(");
        return;
      }
    }
    System.out.println("Yay!");
    return;

  }
}