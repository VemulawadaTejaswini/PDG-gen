import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String[] hiki = scan.nextLine().split(" ");
    int N = Integer.parseInt(hiki[0]);
    int M = Integer.parseInt(hiki[1]);
    int C = Integer.parseInt(hiki[2]);
    hiki = scan.nextLine().split(" ");
    int[] B = new int[M];
    for(int i = 0;i < M;i ++){
      B[i] = Integer.parseInt(hiki[i]);
    }
    int count = 0;
    for(int i = 0;i < N;i ++){
      int tmp = 0;
      hiki = scan.nextLine().split(" ");
      for(int j = 0;j < M;j ++){
        tmp += Integer.parseInt(hiki[j]) * B[j];
      }
      tmp += C;
      if(tmp > 0){
        count ++;
      }
    }
    System.out.println(count);
  }
}
