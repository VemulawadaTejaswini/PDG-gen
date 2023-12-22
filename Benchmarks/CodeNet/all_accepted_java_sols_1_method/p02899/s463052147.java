import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    int mem[]=new int[num];
    int come[]=new int[num];
    for(int a=0;a<num;a++){
      mem[a]=scan.nextInt();
    }
    for(int a=1;a<num+1;a++){
          come[mem[a-1]-1]=a;
    }
    for(int a=0;a<num;a++){
      System.out.print(come[a]+" ");
    }
  }
}