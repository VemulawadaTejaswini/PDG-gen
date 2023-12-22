import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int m = sc.nextInt();
    
    int[] arr = new int[n];
    int cntAC = 0;
    int cntWA = 0;
    int[] cntWAs = new int[n];
    
    for(int i = 0; i < m; i++){
      int num = sc.nextInt();
      String res = sc.nextLine();
      //System.out.println(res);
      
      if(arr[num - 1] == 0){
        if(res.equals(" AC")){
          cntAC++;
          cntWA += cntWAs[num - 1];
          arr[num - 1] = 1;
        }else{
          cntWAs[num - 1]++;
        }
      }
    }
    
    System.out.println(cntAC + " " + cntWA);
  }
}