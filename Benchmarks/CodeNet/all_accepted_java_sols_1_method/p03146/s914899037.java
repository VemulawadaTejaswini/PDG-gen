import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();

   List<Integer> con = new ArrayList<>();
   while(!con.contains(N))
   {
     con.add(N);
     if(N%2==0) N = N/2;
     else N = 3*N +1;
   }
   
   System.out.println(con.size()+1);
 }
}