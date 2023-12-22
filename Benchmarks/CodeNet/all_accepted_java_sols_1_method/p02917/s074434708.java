import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] seq = new int[n];
    int total = 0;
    if(n ==2){
      total = 2* sc.nextInt();
    }else{
      for(int i = 0; i < n - 1; i++){
   seq[i] = sc.nextInt();
     if(i == 0){
     total += seq[i];
     }else if(i == n-2){
     total += seq[i];
       total += Math.min(seq[i],seq[i-1]);
     }else{
     total += Math.min(seq[i],seq[i-1]);
     }
   }  
    }
    System.out.println(total);
  }

}