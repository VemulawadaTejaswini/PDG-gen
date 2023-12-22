import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int T = sc.nextInt();
   
   List<Integer> cost = new ArrayList<>();
   int c = 0;
   int t = 0;
   for(int i =0;i<N;i++) 
   {
     c = sc.nextInt();
     t = sc.nextInt();
     
     if(t<=T) cost.add(c);
   }
   
   if(cost.size() == 0) System.out.println("TLE");
   else 
   {
     Collections.sort(cost);
     System.out.println(cost.get(0));
   }
 }
}