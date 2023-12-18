import java.util.Scanner;

class Main {
  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    String[] array = new String[size];
    for (int i = 0; i < size; i++) {
      array[i] = sc.next();
    }

    stable(array);
    System.out.println("Stable");

    notStable(array);
    System.out.println("Not stable");
  }

  public static void stable(String[] realArray) {
    int[] array = strToInt(realArray);
    int size = realArray.length;

    for (int i = 0; i < size; i++) {
      for (int j = size - 1; j > i; j--) {
        if (array[j] < array[j-1]) {
          swap(realArray, j - 1, j);
          swap(array, j - 1, j);
        }
      }
    }
    print(realArray);
  }

  public static void notStable(String[] realArray) {
    int[] array = strToInt(realArray);
    int size = realArray.length;
    
    for (int i = 0; i < size - 1; i++) {
      int min = i;
      for (int j = i; j < size; j++) {
        if (array[j] < array[min]) {
          min = j;
        }
      }
      if (min != i) {
        swap(realArray, min, i);
        swap(array, min, i);
      }
    }

    print(realArray);
  }

  public static int[] strToInt(String[] strArray) {
    int[] intArray = new int[strArray.length];
    for (int i = 0; i < strArray.length; i++) {
      intArray[i] = Integer.parseInt(strArray[i].replaceAll("[^0-9]", ""));
    }

    return intArray;
  }

  public static void swap(String[] array, int min, int i) {
    String tmp = array[i];
    array[i] = array[min];
    array[min] = tmp;
  }

  public static void swap(int[] array, int min, int i) {
    int tmp = array[i];
    array[i] = array[min];
    array[min] = tmp;
  }

  public static void print(String[] array) {
    int size = array.length;
    for (int i = 0; i < size - 1; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println(array[size - 1]);
  }
}

