import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Supplier<IntStream> repn=  ()-> IntStream.range(0,n);
//    IntStream repn = IntStream.range(0,n);
    Integer[] a =repn.get().map(x-> sc.nextInt())
                           .boxed()
                           .toArray((i) -> new Integer[i]);
    Integer[] b =repn.get().map(x-> sc.nextInt())
                           .boxed()
                           .toArray((i) -> new Integer[i]);
    int value =  repn.get().map(i-> a[i]-b[i])
                           .filter(x-> x>0)
                           .sum();
    System.out.println(value);
}}