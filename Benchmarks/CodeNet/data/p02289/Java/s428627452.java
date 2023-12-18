import java.util.*;
import java.io.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {
  static int A[] = new int[2000000];
  static int H = 0;

  public static void main(String args[])throws Exception{
    Scanner sc = new Scanner(System.in);

		for(;;){
			String s = sc.next();
			if(s.equals("end")) break;
			if(s.equals("insert")){
				int k = sc.nextInt();
				insert(k);
			} else if(s.equals("extract")){
        out.println(heapExtractMax(A));
      }
		}

		sc.close();
	}

  static void insert(int key){
    H++;
    A[H] = (int)Double.NEGATIVE_INFINITY;
    heapIncreaseKey(A, H, key);
  }

  static void heapIncreaseKey(int A[], int i, int key){
    if(key<A[i]){
      return;
    }

    A[i] = key;
    int tmp = 0;

    while(i > 1 && A[parent(i)] < A[i]){
      tmp = A[i];
      A[i] = A[parent(i)];
      A[parent(i)] = tmp;
      i = parent(i);
    }
  }

  static int heapExtractMax(int A[]){
    if(H<1){
      return Integer.MIN_VALUE;
    }

    int max = A[1];
    A[1] = A[H--];
    maxHeapify(A, 1);

    return max;
  }

  static void maxHeapify(int[] A, int i) {
    int leftId = i * 2;
    int rightId = i * 2 + 1;
    int largest = 0;

    if (leftId <= H && A[leftId] > A[i]) {
	    largest = leftId;
    } else {
      largest = i;
    }

    if (rightId <= H && A[rightId] > A[largest]) {
      largest = rightId;
    }

    if (largest != i) {
      int tmp = A[i];
      A[i] = A[largest];
      A[largest] = tmp;
      maxHeapify(A, largest);
    }
  }

  static int parent(int i){
    return i/2;
  }

}

