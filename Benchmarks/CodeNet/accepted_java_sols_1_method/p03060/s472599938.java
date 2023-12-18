import java.util.*;
import java.util.stream.*;

class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    IntStream repn = IntStream.range(0,n);
    Integer[] a =IntStream.range(0,n)
                          .map(x-> sc.nextInt())
                          .boxed()
                          .toArray((i) -> new Integer[i]);
    Integer[] b =IntStream.range(0,n)
                          .map(x-> sc.nextInt())
                          .boxed()
                          .toArray((i) -> new Integer[i]);
    int value =  repn
                .map(i-> a[i]-b[i])
                .filter(x-> x>0)
                .sum();
    System.out.println(value);
}}