import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ArrayList<Double> list = new ArrayList<Double>();
    while(sc.hasNext()) {
      double h = sc.nextDouble();
      list.add(h);
    }
    Double[] arr = (Double[])list.toArray(new Double[list.size()]);
    Arrays.sort(arr);
    System.out.println(arr[arr.length-1]-arr[0]);
  }
}