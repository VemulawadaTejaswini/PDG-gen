import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args) throws IOException{
    Scanner scan=new Scanner(System.in);
    int[] array=new int[3];

    for(int i=0;i<array.length;i++){
      array[i]=Integer.parseInt(scan.next());
    }

    Arrays.sort(array);

    System.out.println(array[0]+" "+array[1]+" "+array[2]);
  }
}
