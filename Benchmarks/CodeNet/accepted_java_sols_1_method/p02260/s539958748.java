
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //Input
    Scanner scanner = new Scanner(System.in);
    int total_element = scanner.nextInt();
    int[] data_array = new int[total_element];
    for (int i = 0; i < total_element; i++) {
      data_array[i] = scanner.nextInt();
    }


    //selectionSort
    int count = 0;
    for (int i = 0; i < total_element; i++) {
      int min_element = i;
      for (int j = i + 1; j < total_element; j++) {
        if(data_array[j] < data_array[min_element]) {
          min_element = j;
        }
      }
      if(i != min_element) {
        int bf = data_array[i];
        data_array[i] = data_array[min_element];
        data_array[min_element] = bf;
        count++;
      }
    }

    //Output
    
    for (int i = 0; i < total_element - 1; i++) {
      System.out.print(data_array[i] + " ");
    }
    System.out.println(data_array[total_element - 1]);
System.out.println(count);
  }

}

