import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int q = Integer.parseInt(br.readLine());
      EzDeque<String> edq = new EzDeque<>(q, "");

      String[] query;
      int op,accessWay,index;
      for ( int i=0; i<q; i++ ){
        query = br.readLine().split(" ");
        op  = Integer.parseInt(query[0]);

        switch( op ) {
          case 0 :
            accessWay = Integer.parseInt(query[1]);
            if ( accessWay == 0 )
              edq.addFirst(query[2]);
            else
              edq.addLast(query[2]);
            break;
          case 1 :
            System.out.println( edq.get(Integer.parseInt(query[1])) );
            break;
          case 2 :
            accessWay = Integer.parseInt(query[1]);
            if ( accessWay == 0 )
              edq.removeFist();
            else
              edq.removeLast();
            break;
          default:
        }
      }
    }
  }
}

class EzDeque<E> {

  private Object[] array;
  private int iHead;
  private int iTail;

  public EzDeque(int size, E init) {
    array = new Object[size*2];
    Arrays.fill(array, init);
    iHead = iTail = size;
  }

  public void addFirst(E val) {
    array[iHead--] = val;
  }
  public void addLast(E val) {
    array[++iTail] = val;
  }
  public void removeFist() {
    iHead++;
  }
  public void removeLast() {
    iTail--;
  }
  @SuppressWarnings("unchecked")
  public E get(int index) {
    index += (iHead+1);
    return ( E ) array[index];
  }
}
