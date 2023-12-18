import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int numOfLamps = sc.nextInt();
    int numOfReps = sc.nextInt();

    int[] brightnessArray = new int[numOfLamps];
    for(int i = 0; i < brightnessArray.length; i++){
      brightnessArray[i] = sc.nextInt();
    }

    //continue k times
    for(int n = 0; n < numOfReps; n++){

      int[] sumArray = new int[numOfLamps];

      //go through lamps
      for(int i = 0; i < brightnessArray.length; i++){
        int sum = 0;
        //check neighbors if radius includes current position
        for(int j = 0; j < brightnessArray.length; j++){
          if( i <= ( j + brightnessArray[j] + 0.5 ) && i >= ( j - brightnessArray[j] - 0.5 ) ){
            sum++;
          }
        }
        //store sum values
        sumArray[i] = sum;
      }

      //change values
      for(int i = 0; i < brightnessArray.length; i++){
        brightnessArray[i] = sumArray[i];
      }

      //if final print out final sums
      if( n == (numOfReps - 1) ){
        for( int i = 0; i < sumArray.length; i++ ){
          System.out.print(sumArray[i]+" ");
        }
      }
    }

  }
}
