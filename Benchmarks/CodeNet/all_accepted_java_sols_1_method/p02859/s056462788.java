import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        int n = Integer.parseInt(br.readLine());
        int area = n * n;

        System.out.println(area);
      }
    }
}