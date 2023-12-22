import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int[] x = new int[n];
    
    for(int i=0; i<n; i++){
      x[i] = sc.nextInt();
    }
    
    int min = x[0];
    int max = x[0];
    
    for(int i=0; i<n; i++){
      if(min > x[i]){
        min = x[i];
      }
      
      if(max < x[i]){
        max = x[i];
      }
    }
    
    int total = 0;
    int st = 2147483647;
    
    for(int i=min; i<=max; i++){
      for(int j=0; j<n; j++){
        total += (x[j]-i) * (x[j]-i);
        if(j == n-1 && st > total){
          st = total;
          total = 0;
        }else if(j == n-1){
          total = 0;
        }else{
        
        }
      }
    }
    
    System.out.println(st);
  }
}
