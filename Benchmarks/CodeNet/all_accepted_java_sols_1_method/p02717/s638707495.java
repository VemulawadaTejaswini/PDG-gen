import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int[] box;
    box=new int[3];
    int[] score=new int[1];
    int m=box.length;
    for(int s=0;s<m;s++){
      box[s]=sc.nextInt();
    }
    score[0]=box[1];
    box[1]=box[0];
    box[0]=score[0];
    score[0]=box[2];
    box[2]=box[0];
    box[0]=score[0];
    System.out.println(box[0]+" "+box[1]+" "+box[2]);
  }
}
