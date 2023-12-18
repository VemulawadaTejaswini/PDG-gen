import java.util.*;
import java.io.*;

class Main {
  static int n;
  public static void main(String[] args) throws IOException {
    int i;
    BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(buffer.readLine());
    Deque<Integer> d = new ArrayDeque<Integer>();
    String[] str;

    for(i=0;i<n;i++) {
        str = buffer.readLine().split(" ");
        switch(str[0]) {
            case "insert":
                d.addFirst(Integer.parseInt(str[1]));
                break;
            case "delete":
                d.remove(Integer.parseInt(str[1]));
                break;
            case "deleteLast":
                d.removeLast();
                break;
            case "deleteFirst":
                d.remove();
                break;
        }
    }
    for(i=d.size();i>0;i--){
      if(i==1){
        System.out.println(d.poll());
        break;
      }
      System.out.print(d.poll()+" ");
    }
  }
}

