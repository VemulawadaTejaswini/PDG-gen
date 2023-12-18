import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int array_length = scan.nextInt();

    int[] array =new int[array_length];
    for (int i = 0; i < array_length; i++) {
      array[i] = scan.nextInt();
    }

    selectionSort(array_length, array);
  }

  public static void printArray(int array[], int count) {
  	for (int i = 0; i < array.length-1 ; i++) {
  	    System.out.print(array[i] + " ");
  	}
    System.out.println(array[array.length-1]);
  	System.out.println(count);
  }

  public static void selectionSort(int n, int array[]){

    int count = 0;
    for(int i = 0; i < n; i++){
      int minj = i;
      for(int j = i; j < n; j++){
        if(array[j] < array[minj]){
          minj = j;
        }
      }
      if(minj != i){
      int swap = array[i];
      array[i] = array[minj];
      array[minj] = swap;
      count++;
      }
    }
    printArray(array, count);


  }
}

