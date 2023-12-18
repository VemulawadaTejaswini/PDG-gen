import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int H = sc.nextInt();
    int W = sc.nextInt();
    int M = sc.nextInt();
    
    int[] h = new int[M];
    int[] w = new int[M];

    int[] hcount = new int[H + 1];

    for(int i=0; i<M; i++){
      h[i] = sc.nextInt();
      w[i] = sc.nextInt();
      hcount[h[i]]++;
    }

    ArrayList<Integer> hcand = new ArrayList<Integer>();

    int max = 0;
    for(int i=0; i<hcount.length; i++){
      if(max < hcount[i]){
        max = hcount[i];
      }
    }

    for(int i=0; i<hcount.length; i++){
      if(hcount[i] == max){
        hcand.add(i);
      }
    }

    int result = 0;
    for (Integer hidx : hcand) {
      int[] wcount = new int[W + 1];

      for(int i = 0; i<w.length; i++){
  
        if(hidx != h[i]){
          wcount[w[i]]++;
        }
      }

      int maxw = 0;
      for(int i=0; i<wcount.length; i++){
        if(maxw <= wcount[i]){
          maxw = wcount[i];
        }
      }

      if(result < max + maxw){
        result = max + maxw;
      }
    }

    System.out.println(result);

    return;

  }
}