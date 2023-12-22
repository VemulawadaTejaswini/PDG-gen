import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n  = sc.nextInt();
    int[][] town = new int[n][2];
    
    for(int i=0; i<n; i++){
      for(int j=0; j<2; j++){
        town[i][j] = sc.nextInt();
      }
    }
    
    double x = 0;
    double y = 0;    
    double total = 0.0;
    
    for(int i=0; i<n; i++){
      for(int j=i+1; j<n; j++){
        x = (town[i][0]-town[j][0])*(town[i][0]-town[j][0]);
        y = (town[i][1]-town[j][1])*(town[i][1]-town[j][1]);
        total += Math.sqrt(x + y);
      }
    }
    
    System.out.println(total*2/n);
  }
}
