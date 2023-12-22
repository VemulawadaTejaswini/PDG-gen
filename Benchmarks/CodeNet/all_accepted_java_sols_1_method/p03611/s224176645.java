import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int[] ss = new int[N];
   for(int i=0;i<N;i++)  ss[i] = sc.nextInt();
   
   int[] forans = new int[100001];
   for(int i=0;i<N;i++) forans[ss[i]]++;
   
   int tmp = forans[0]+forans[1]+forans[2];
   int max = tmp;
   for(int i=1;i<99999;i++)
   {
     tmp+=forans[i+2]-forans[i-1];
     if(tmp>max) max=tmp;
   }
   
   System.out.println(max);
 }
}