import java.util.Scanner;

 public class Main{
  public static void main(String[] args){ 
  int[] x= new int[100];
   Scanner sc=new Scanner(System.in);
   for(i=0;x[i]!=0;i++){
    x[i]=sc.nextInt();
    if(x[i]!=0)
     System.out.println("Case "+i+": "+x[i]);
    }
  }
}