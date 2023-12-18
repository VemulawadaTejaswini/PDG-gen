import java.io.*;
import java.util.*;

class Main{

  final static int MAX=3000;

  public static void main(String[] args)throws java.lang.Exception {
    Scanner scan=new Scanner(System.in);
    List<Integer> x=new ArrayList<Integer>();
    List<Integer> y=new ArrayList<Integer>();
    while(true){
      x.add(scan.nextInt());
      y.add(scan.nextInt());
      if(x.contains(0) && y.contains(0)){
        Collections.sort(x);
        Collections.sort(y);
        for(int i=1;i<x.size();i++){
          System.out.println(x.get(i)+" "+y.get(i));
        }
        break;
      }
    }
  }
}
