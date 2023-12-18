import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int N = s.nextInt();
    ArrayList<Double> L = new ArrayList<Double>();
    for (int i=0;i<N;i++){
      L.add(s.nextDouble());
    }
    Collections.sort(L);
    Double Sum = 0.0;
    Sum += L.get(0) / Math.pow(2, N-1);
    for (int i=1;i<N;i++){
      Sum += L.get(i) / Math.pow(2, N-i);
    }
    System.out.println(Sum);
    
    
  }
}