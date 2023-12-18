import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        String[] input = br.readLine().split(" ");
        String[] attack_input = br.readLine().split(" ");

        int H = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);

        int tmp = 0;

        for(int i = 0; i < N; i++){
          tmp = Integer.parseInt(attack_input[i]);
          H -= tmp;
        }

        if(H <= 0){
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }
      }
    }
}