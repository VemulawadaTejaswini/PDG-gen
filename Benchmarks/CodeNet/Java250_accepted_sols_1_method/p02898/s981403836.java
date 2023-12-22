import java.util.Scanner;

class Main{
  public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int K = scanner.nextInt();
    
    int a = 0;
    for(int i = 1;i <= N;i++){
      int h = scanner.nextInt();
      if(h >= K){
       a++;
     }else{
       continue;
     }
    }
    
   
   System.out.println(a);
    
    
    
    
  }
}