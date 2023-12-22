import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args) throws IOException{
    Scanner scan=new Scanner(System.in);
    int[] n=new int[3];
    for(int i=0;i<n.length;i++){
      n[i]=Integer.parseInt(scan.next());
    }

    if(n[0]<n[1] && n[1]<n[2]){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
