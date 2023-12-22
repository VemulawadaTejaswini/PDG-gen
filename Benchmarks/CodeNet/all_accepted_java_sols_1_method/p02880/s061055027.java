import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String answer ="No";
    int qq[][] = new int[9][9];
    for(int i=0;i<9;i++){
      for(int j=0;j<9;j++){
        qq[i][j]=(i+1)*(j+1);
      }
    }
    
    for(int i=0;i<9;i++){
      for(int j=0;j<9;j++){        
        if(N==qq[i][j]){
          answer ="Yes";
        }
      }
    }
    System.out.println(answer);
      
      
    
    
    
  }
  

  
}