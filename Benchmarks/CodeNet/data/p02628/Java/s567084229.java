import java.util.Scanner;

import java.util.ArrayList;
import java.util.Collections;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); //ぜんぶ
    int K = sc.nextInt(); //買うやつ
    
    ArrayList<Integer> list = new ArrayList<Integer>(); //ねだん
    
    for(int i = 0; i < N; i++) {
      list.add(sc.nextInt());
    }
    Collections.sort(list);
    
    Integer sum = 0;
    for(int i = 0; i < K; i++) {
      sum += list.get(i);
    }
    System.out.println(sum);
  }
}