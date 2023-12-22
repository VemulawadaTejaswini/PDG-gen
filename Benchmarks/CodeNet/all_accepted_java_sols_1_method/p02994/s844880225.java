import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int L = sc.nextInt();
   int sum = 0;
   if(L <= 0 && 1-L<=N){
    for(int i = 0;i<N;i++){
     sum += i+L ;
    }
     System.out.println(sum);
   }else if(L > 0){
    for(int i = 1;i<N;i++){
     sum += i+L ;
    }
     System.out.println(sum);
   }else {
    for(int i = 0;i<N-1;i++){
     sum += i+L ;
    }
     System.out.println(sum);
   }
 
 }
}