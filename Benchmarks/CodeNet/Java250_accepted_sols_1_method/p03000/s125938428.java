import java.util.Scanner;

public class Main{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    
    int[] l = new int[n];
    int bound = 0;
    int count = 1;
    
    for(int i =0; i < n; i++){
      bound += sc.nextInt();
      
      if(bound > x){
        break;
     }   
      count++;
    }
    System.out.println(count);
  }
 }