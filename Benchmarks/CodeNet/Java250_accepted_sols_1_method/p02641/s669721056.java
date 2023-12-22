import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int n = sc.nextInt();
    int p[] = new int[n];
    int s[] = new int[n];
    if(n==0){
      System.out.println(x);
      return;
    }
    for(int i = 0 ; i < n ; ++i){
      p[i] = sc.nextInt();      
    }
    
    Arrays.sort(p);
    
    int ue_s = 0;
    int st_s = 0;
    int ue_ans = 0;
    int st_ans = 0;
    

    //うえ
    for(int i = x ; i <= 101 ; ++i){
      int count=0;
      for(int j = 0 ; j < n ; ++j){   
        if(p[j] != i){
          count++; 
        }else if(p[j] == i){
          break;
        }
      }if(count == p.length){
        ue_ans = i;
        break;
      }
    }

    //した
    for(int i = x ; i >= 0 ; --i){
      int count=0;
      for(int j = 0 ; j < n ; ++j){
        if(p[j] != i){
          count++; 
        }else if(p[j] == i){
          break;
        }
      }if(count == p.length){
        st_ans = i;
        break;
      }
    }
    ue_s = Math.abs(x-ue_ans);
    st_s = Math.abs(x-st_ans);
    if(ue_s<st_s) System.out.println(ue_ans);
    else System.out.println(st_ans);
    
  }
}