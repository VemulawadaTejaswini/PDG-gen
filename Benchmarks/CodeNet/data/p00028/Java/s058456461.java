import java.io.*;
import java.util.Scanner;
class Main{
  public static void main(String[] args)throws IOException{
    Scanner scan = new Scanner(System.in);
    int[] list = new int[100];
    while(scan.hasNextInt()){
      list[scan.nextInt()-1]++;
    }
    int max =0;
    for(int i=0;i<list.length;i++){
      max =Math.Max(max , list[i]);
    }
    for(int i=0;i<list.length;i++){
      if(max ==list[i]){
        System.out.printf("%f\n",(i+1));
    }
  }
  }
}