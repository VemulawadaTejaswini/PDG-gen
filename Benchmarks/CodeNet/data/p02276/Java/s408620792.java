import java.util.Scanner;

class Main {
  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);
    int size = Integer.parseInt(sc.next());
    int[] array = new int[size];
    for (int i = 0; i < size; i++) {
      array[i] = Integer.parseInt(sc.next());
    }
    int p = 0;
    int center = array[size-1];
    Partition(array, 0, size-1);

    for (int i = 0; i < size; i++) {
      if (array[i] == center) {
        System.out.print("[" + array[i] + "] ");
      } else if (i == size - 1) {
        System.out.println(array[i]);
      } else {
        System.out.print(array[i] + " ");
      }
    }
  }

  public static int Partition(int[] array, int p, int r) {
    int x = array[r];
    int i = p - 1;
    int tmp;
    for (int j = p; j < r; j++) {
      if (array[j] <= x) {
        tmp = array[++i];
        array[i] = array[j];
        array[j] = tmp;
      }
    }
    tmp = array[i + 1];
    array[i + 1] = array[r];
    array[r] = tmp;
    return i + 1;
  }
}

