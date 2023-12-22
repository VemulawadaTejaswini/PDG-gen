import java.util.Scanner;
import java.util.ArrayList;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int max = sc.nextInt();
   ArrayList<Integer> Carr = new ArrayList<>(max);
   ArrayList<Integer> Varr = new ArrayList<>(max);
   for(int i=0;i<max;i++){
   int C = sc.nextInt();
   Carr.add(C);
   }
   for(int j=0;j<max;j++){
   int V = sc.nextInt();
   Varr.add(V);
   }
   int mem = 0;
   
 for(int k=0;k<max;k++){
   int m = Carr.get(k)-Varr.get(k);
   if(m>=0){ mem += m;}
 }
    System.out.print(mem);
 }
}