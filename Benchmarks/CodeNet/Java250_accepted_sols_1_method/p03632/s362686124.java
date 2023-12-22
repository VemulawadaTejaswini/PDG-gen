import java.util.*;
import java.lang.*;

public class Main {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String[] inp = s.split(" ");
    int A = Integer.parseInt(inp[0]);
    int B = Integer.parseInt(inp[1]);
    int C = Integer.parseInt(inp[2]);
    int D = Integer.parseInt(inp[3]);
    int start = Math.max(A, C);
    int end = Math.min(B, D);
    int out = end - start;
    if (out < 0) out = 0;
    System.out.println(out);
  }
}

