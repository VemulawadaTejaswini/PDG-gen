import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    int len = str.length();
    int[] array = new int[len-2];

    for(int i=0; i<len-2; i++){
      array[i] = Math.abs(753 - Integer.parseInt(str.substring(i, i+3)));
    }

    Arrays.sort(array);
    System.out.println(array[0]);
  }
}