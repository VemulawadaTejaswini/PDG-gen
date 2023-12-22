//import java.io.*;
//import java.util.Arrays;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

class Main{
	public static void main(String[] args) throws IOException {
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Deque<Integer> dq = new ArrayDeque<Integer>();

    int n = Integer.parseInt(br.readLine());

    for(int i = 0;i < n;i++){
      String com = br.readLine();
      if(com.charAt(0) == 'i') dq.push(Integer.parseInt(com.substring(7)));
      //else if(com.charAt(0) == 'd') dq.remove(Integer.parseInt(com.substring(7)));
      else if(com.charAt(6) =='F') dq.removeFirst();
      else if(com.charAt(6) =='L') dq.removeLast();
      else dq.remove(Integer.parseInt(com.substring(7)));
    }
    /*for(int i = 0; i < dq.length();i++){
      System.out.println(dq);
      //if()
    }*/
    System.out.print(dq.poll());
    for(int num : dq){
      System.out.print(" "+num);
      //dq.length();
    }
    System.out.println();
  }
}

