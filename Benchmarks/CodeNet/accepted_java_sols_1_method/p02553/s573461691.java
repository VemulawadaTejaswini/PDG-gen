import java.util.*;


class Main{
    //ans
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
      long[] inp = new long[4]; 
      inp[0] = (long)sc.nextInt();
      inp[1] = (long)(long)sc.nextInt();
      inp[2] = (long)sc.nextInt();
      inp[3] = (long)sc.nextInt();
      long[] time = new long[4];
      int ti = 0;
      for(int i = 0;i<2;i++){
        for(int k = 2;k<4;k++){
          time[ti]=inp[i]*inp[k];
          ti++;
        }
      }
      long max = time[0];
      for(int i = 1;i<4;i++){
        if(time[i]>max){
          max = time[i];
        }
      }
      System.out.println(max);
    }
}