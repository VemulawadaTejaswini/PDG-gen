import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        //input
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        //for algorithm & input
        boolean[] answer = new boolean[N+1];
        int[] wrong = new int[N+1];
      
        Arrays.fill(answer, false);
        Arrays.fill(wrong, 0);
        int pena = 0;
        int result = 0;

        for(int i = 0; i < M; i++){
          String[] in = br.readLine().split(" ");
          int num = Integer.parseInt(in[0]);
         
          if(answer[num] == false){
            if(in[1].equals("AC")){
              answer[num] = true;
              result++;
              pena += wrong[num];
            }else{
              wrong[num] += 1;
            }
          }else{
            continue;
          }
        }

        System.out.println(result + " " + pena);

      }
    }
}
