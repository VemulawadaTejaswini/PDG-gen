import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //input
    int n = sc.nextInt();
    int[] intArray = new int[n];
    for(int i = 0; i < intArray.length; i++){
      intArray[i] = sc.nextInt();
    }

    //output
    int sum = 0;
    for(int i = 0; i < intArray.length; i++){
      boolean divisible = false;
      for(int j = 0; j < intArray.length; j++){
        if( i == j ){
          j++;
        }

        if( intArray[i]%intArray[j] == 0 ){
          divisible = true;
          break;
        }
      }

      if( !divisible ){
        sum++;
      }
    }
    System.out.println(sum);

  }
}
