import java.util.*;
   
class SortNum{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    int a = Integer.parseInt(scan.next());
    int b = Integer.parseInt(scan.next());
    int c = Integer.parseInt(scan.next());
    ArrayList<Integer> num = new ArrayList<Integer>();
    num.add(a);
    num.add(b);
    num.add(c);
    Collections.sort(num);
　　int[] array =(Integer[])num.toArray(new int[num.size()]);

    for(int i = 0; i < array.length; i++){ 
      System.out.println(array[i] + " ");
    }
  System.out.println();
  }
}