import java.util.Scanner;

class Main {
  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt() + 1;
    int[] heap = new int[size];
    for (int i = 1; i < size; i++) {
      heap[i] = sc.nextInt();
    }

    for (int i = size / 2; i > 0; i--) {
      maxHeapify(heap, i, size);
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 1; i < size; i++) {
      sb.append(" ").append(heap[i]);
    }
    System.out.println(sb);
  }

  public static void maxHeapify(int[] heap, int i, int size) {
    int l = i * 2;
    int r = i * 2 + 1;
    int largest;

    if (l < size && heap[l] > heap[i]) {
      largest = l;

    } else {
      largest = i;
    }

    if (r < size && heap[r] > heap[largest]) {
      largest = r;
    }

    if (largest != i) {
      int tmp = heap[i];
      heap[i] = heap[largest];
      heap[largest] = tmp;
      maxHeapify(heap, largest, size);
    }
  }
}

