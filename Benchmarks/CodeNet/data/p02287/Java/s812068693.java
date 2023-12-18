import java.util.*;
import java.io.*;
import java.lang.*;
class Main{
  public static void main(String args[]){

    int id, k, l, r,p;
    StringBuilder build = new StringBuilder();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Node node[] = new Node[n+1];

    for(int i = 1; i<n+1; i++){
      node[i] = new Node();
      node[i].key = sc.nextInt();
    }

    for(int i = 1; i<n+1; i++){
      System.out.print("node "+i+": key = "+node[i].key+", ");
      l = i*2;
      r =  i*2+1;
      p = i/2;
      if(p>=1)System.out.print("parent key = "+node[p].key+", ");
      // build.append("parent key = ").append(node[i].pk).append(", ");
      if(l<=n)System.out.print("left key = "+node[l].key+", ");
      // build.append("left key = ").append(node[i].lk).append(", ");
      if(r<=n)System.out.print("right key = "+node[r].key+", ");
      System.out.println("");
      // if(l<=n)node[i].lk = node[l].key;
      // if(r<=n)node[i].rk = node[r].key;
      // if(p>1)node[i].pk = node[p].key;

    }

    for(int i = 1 ; i < n; i++){
      // build.append("node ").append(node[i].id).append(": key =  ").append(node[i].key).append(", ");


      // build.append("right key = ").append(node[i].rk).append(", ");
      // build.append("\n");
    }

    // System.out.print(build);

  }
}

class Node{
  int id;
  int key;
  int pk = -1;
  int lk = -1;
  int rk = -1;
}

