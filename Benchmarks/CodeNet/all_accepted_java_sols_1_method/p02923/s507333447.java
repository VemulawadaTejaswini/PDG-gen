import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next()); 
    int counter = 0;
    int max = 0;
    int a[] = new int[N];
    for (int i=0; i < N ;i++) {
        a[i] = Integer.parseInt(sc.next()); 
    }
    for (int i=0; i < N-1 ;i++) {
        if(a[i] >= a[i+1]){
            counter++;
            max = Math.max(max,counter);
        }else{
            counter=0;
        }
    }
    System.out.println(max);
  }
}

