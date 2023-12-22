import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int a[][] = new int[3][3];    
    for(int i = 0 ; i < 3 ; ++i){
      for(int j = 0 ; j < 3 ; ++j){
        a[i][j] = sc.nextInt();
      }
    }
    
    int n = sc.nextInt();
    int b[] = new int[n]; 
    for(int k = 0 ; k < n ; ++k){
      b[k] = sc.nextInt();
    }

    for(int i = 0 ; i < 3 ; ++i){
      for(int j = 0 ; j < 3 ; ++j){
        for(int k = 0 ; k < n ; ++k){
        if(a[i][j] == b[k]){
          a[i][j] = 0;
        }
        }
      }
    }
    
    String ans = "No";
    
    //横
    for(int i = 0 ; i < 3 ; ++i){
      boolean ju = false;
      for(int j = 0 ; j < 3 ; ++j){
        if(a[i][j] == 0){
          ju = true;
        }else{
          ju = false;
          break;
        }
      }
      if(ju){
        ans = "Yes";
        break;
      }
    }
    //縦
    for(int j = 0 ; j < 3 ; ++j){
      boolean ju = false;
      for(int i = 0 ; i < 3 ; ++i){
        if(a[i][j] == 0){
          ju = true;
        }else{
          ju = false;
          break;
        }
      }
      if(ju){
        ans = "Yes";
        break;
      }
    }
    //斜め
    if(a[0][0]==0 && a[1][1]==0 && a[2][2]==0){
      ans = "Yes";
    }
    
    if(a[0][2]==0 && a[1][1]==0 && a[2][0]==0){
      ans = "Yes";
    }
    
    

    System.out.println(ans);
    
  }
}