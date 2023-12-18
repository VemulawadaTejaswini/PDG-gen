import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

  public static void main(String[] args) {
    
    new Main().run();
  }

  private void run() {

    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int heapSize = Integer.parseInt(br.readLine());
      String[] keys = br.readLine().split(" ");
      int[] mHeap = new int[heapSize+1];
      mHeap[0] = heapSize;
      for(int i=1; i<=heapSize; i++)
        mHeap[i] = Integer.parseInt( keys[i-1] );

      buildMaxHeap(mHeap);

      StringBuilder buf = new StringBuilder();
      for(int i=1; i<mHeap.length; i++) 
        buf.append(" ").append(mHeap[i]);

      System.out.println(buf);
    } catch(IOException e) {
      System.out.println("IOException!");
    }
  }
  private void buildMaxHeap(int[] heap) {
    for(int i= heap[0]/2; i>0; i--)
      maxHeapify(heap, i);
  }
  private void maxHeapify(int[] heap, int node) {
    int t,left,right,largest;
    t = largest = 0;
    left  = nodeLeft(node);
    right = nodeRight(node);

    if( (left <= heap[0]) && (heap[left] > heap[node]) )
      largest = left;
    else
      largest = node;
    if( (right <= heap[0]) && (heap[right] > heap[largest]) )
      largest = right;

    if( largest != node ) {
      t = heap[node]; heap[node] = heap[largest]; heap[largest] = t;

      maxHeapify(heap, largest);
    }
  }
  private int nodeLeft(int node) {
    return node*2;
  }
  private int nodeRight(int node) {
    return node*2+1;
  }
}
