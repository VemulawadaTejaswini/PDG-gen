import java.util.Scanner;

public class Main {
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  while(true){
   int n=sc.nextInt();
   int m=sc.nextInt();
   if(n==0&&m==0) break;
   int[] data = new int[n];
   for(int i=0;i<n;++i){
    data[i]=sc.nextInt();
   }
   int max=-1;
   for(int j=0;j<n;++j){
    for(int i=j+1;i<n;++i){
     if(max<data[i]+data[j] && data[i]+data[j]<=m) max=data[i]+data[j];
    }
   }
   if(max==-1) System.out.println("NONE");
   else System.out.println(max);
  }
 }
}
