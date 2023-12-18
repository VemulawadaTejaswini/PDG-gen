import java.io.*;
import java.util.*;
import java.lang.*;
import java.lang.Math;

class Main{
  public static void main(String[] args) throws IOException{
    Scanner scan=new Scanner(System.in);
    int[] point1=new int[2];
    int[] point2=new int[2];

    for(int i=0;i<2;i++){
      point1[i]=Integer.parseInt(scan.next());
    }
    for(int i=0;i<2;i++){
      point2[i]=Integer.parseInt(scan.next());
    }

    double distance=Math.sqrt(Math.pow(point1[0]-point2[0],2)+Math.pow(point1[1]-point2[1],2));

    System.out.printf("%f",distance);
  }
}
