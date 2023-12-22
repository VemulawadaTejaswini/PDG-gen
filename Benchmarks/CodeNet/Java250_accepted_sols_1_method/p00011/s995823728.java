import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    sc.useDelimiter(",|\n");
    int w=sc.nextInt();
    int array[]=new int[w];
    for(int i=0;i<w;i++) array[i]=i+1;
    int n=sc.nextInt();
    int a,b,c;
    for(int i=0;i<n;i++){
      a=sc.nextInt();
      b=sc.nextInt();
      c=array[a-1];
      array[a-1]=array[b-1];
      array[b-1]=c;
    }
    for(int i=0;i<w;i++) System.out.println(array[i]);
    sc.close();
  }
}
