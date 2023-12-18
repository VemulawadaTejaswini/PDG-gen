import java.util.Scanner;

class Main {
  public static final int MAX = 2000001;

  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);
    int[] heap = new int[MAX];
    int current = 0;
    int tmp;
    boolean flg = true;

    while (flg) {
      switch(sc.next().length()) {
        case 6: // insert
          heap[++current] = sc.nextInt();
          break;

        case 7: // extract
          build(heap, current);
          System.out.println(heap[1]);
          tmp = heap[1];
          heap[1] = heap[current];
          heap[current--] = tmp;
          break;

        default: // end
          flg = false;
          break;
      }
    }
  }

  public static final void build(int[] heap, int size) {
    for (int i = size / 2; i > 0; i--) {
      maxHeapify(heap, i, size + 1);
    }
  }

  public static final void maxHeapify(int[] heap, int i, int size) {
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


