import java.util.*;

class Main {
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  Integer array[] = new Integer[n] ;
  for(int i=0; i<n; i++){
    array[i] = sc.nextInt();
  }
  int count =0;
  int max = array[0];
  for(Integer elem:array){
    if (elem >= max){
      count += 1;
      max = elem;
    }
  }
  System.out.println(count);
  }
}