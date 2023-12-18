import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N=sc.nextInt();
    int array[]=new int[N];
    int count=0;
    for(int i=0;i<N;i++) array[i]=sc.nextInt();
    while(true){
      int check=0;
      for(int i=0;i<N-1;i++){
        if(array[i]>array[i+1]){
          check+=1;
          int c=array[i];
          array[i]=array[i+1];
          array[i+1]=c;
          count+=1;
        }
      }
      if(check==0) break;
    }
    for(int i=0;i<N-1;i++) System.out.print(array[i]+" ");
    System.out.println(array[N-1]+"\n"+count);
    sc.close();
  }
}
