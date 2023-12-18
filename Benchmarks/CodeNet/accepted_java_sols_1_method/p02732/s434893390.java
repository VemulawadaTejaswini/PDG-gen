import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] in = new int[n];
    int[] cal = new int[n];
    for(int i = 0; i < n; i++){
      in[i] = Integer.parseInt(sc.next());
      cal[in[i] - 1]++;
    }
    long sum = 0L;
    for(int i = 0; i < n; i++){
      if(cal[i] == 0){
        continue;
      }else{
       sum += ((long)cal[i] * (cal[i] - 1)) /  2;
      }
    }
    long[] out = new long[n];
    for(int i = 0; i < n; i++){
      if(cal[i] == 0){
        continue;
      }else{
        out[i] = sum - (cal[i] - 1);
      }
    }
    for(int i = 0; i < n; i++){
      System.out.println(out[in[i] - 1]);
    }
  }
}