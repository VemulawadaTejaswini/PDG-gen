import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    char[] k=sc.next().toCharArray();
    char[] g=sc.next().toCharArray();
    for(int i=0;i<g.length;i++){
      System.out.print(k[i]);
      System.out.print(g[i]);
    }
    if(k.length==g.length){
      System.out.println("");
    }else{
      System.out.println(k[k.length-1]);
    }
  }
}