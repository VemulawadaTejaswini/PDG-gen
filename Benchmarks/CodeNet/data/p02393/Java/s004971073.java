import java.util.*;
  
class Main{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    int a = Integer.parseInt(scan.next());
    int b = Integer.parseInt(scan.next()); 
    int c = Integer.parseInt(scan.next());
    ArrayList num = new ArrayList();
    num.add(new Data(a));
    num.add(new Data(b));
    num.add(new Data(c));
    Object[] sortnum = num.toArray();
    Arrays.sort(sortnum, DataComparator());

    for(int i; i < sortnum.length; i++;){
      System.out.println((Data)num.toArray()[i]);
    }
  }
}