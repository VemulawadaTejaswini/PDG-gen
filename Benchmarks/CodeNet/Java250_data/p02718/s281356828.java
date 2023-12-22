import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int m = scan.nextInt();
      int c[] = new int[n];

      double count=0;
      
      for(int i=0;i<n;i++){
        c[i] = scan.nextInt();
        count += c[i];
      }
      
      int judge=0;
      for(int i=0;i<n;i++){
        if(c[i]>=count/4/m){
          judge += 1;
        } 
      }
      
      if(judge>=m){
        System.out.println("Yes");
      }
      else{
        System.out.println("No");
      }
      
      }

  }
