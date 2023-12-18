import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args) throws IOException {
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Deque<Integer> dq = new ArrayDeque<Integer>();

    int n = Integer.parseInt(br.readLine());
    Set<String> dic = new HashSet<String>();

    for(int i = 0;i < n;i++){
      String com = br.readLine();
      String cmd[] = com.split(" ");
      if(cmd[0].equals("insert")) dic.add(cmd[1]);
      else {
        if(dic.contains(cmd[1])) System.out.println("yes");
        else System.out.println("no");
      }
    }
    /*for(int i = 0; i < dq.length();i++){
      System.out.println(dq);
      //if()
    }*/
  }
}

