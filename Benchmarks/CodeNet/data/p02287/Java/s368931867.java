import java.util.*;
import java.io.*;
import java.lang.*;
class Main{
  public static void main(String args[]){

    int id, k, l, r,p;
    StringBuilder build = new StringBuilder();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Node node[] = new Node[n];

    for(int i = 0; i<n; i++){
      node[i] = new Node();
      node[i].key = sc.nextInt();
    }

    for(int i = 0; i<n; i++){
      l = (i+1)*2;
      r =  (i+1)*2+1;
      p = (i+1)/2;
      node[i].id = (i+1);
      if(l<=n)node[i].lk = node[l-1].key;
      if(r<=n)node[i].rk = node[r-1].key;
      if(p>=1)node[i].pk = node[p-1].key;

    }

    for(int i = 0 ; i < n; i++){
      build.append("node ").append(node[i].id).append(": key =  ").append(node[i].key).append(", ");
      if(node[i].pk!=-1)build.append("parent key = ").append(node[i].pk).append(", ");
      if(node[i].lk!=-1)build.append("left key = ").append(node[i].lk).append(", ");
      if(node[i].rk!=-1)build.append("right key = ").append(node[i].rk).append(", ");
      if(i!=n)build.append("\n");
    }

    System.out.print(build);

  }
}

class Node{
  int id;
  int key;
  int pk = -1;
  int lk = -1;
  int rk = -1;
}

