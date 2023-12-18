import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        int H = Integer.parseInt(br.readLine());
        int W = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int max = Math.max(H, W);
        int min = Math.min(H, W);

        int max_count = max;
        int min_count = min;

        int result = 0;

        while(N > 0){
          if(max_count != 0){
            N -= max;
            max_count--;
            result++;
          }else if(min_count != 0){
            N -= min;
            min_count--;
            result++;
          }
        }

        System.out.println(result);
      }
    }
}