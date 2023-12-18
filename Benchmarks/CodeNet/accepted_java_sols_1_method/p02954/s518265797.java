import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String S = sc.nextLine();
    int N = S.length();
    int[] num = new int[N];
    int r = 0, l = 0, ir = 0, il = 0;
    for(int i = 0; i < N; i++){
      if(S.charAt(i) == 'R'){
        r++;
      }else{
        l++;
      }
      
      if(S.charAt(i) == 'R' && S.charAt(i+1) == 'L'){
        ir = i;
        il = i+1;
      }
      
      if(S.charAt(i) == 'L'){
        if(i == N-1){
          num[ir] = num[il] = (r+l)/2;
          if((r+l)%2 == 1){
            if((r > l && l%2 == 1) || (r < l && r%2 == 0)){
              num[il]++;
            }else{
              num[ir]++;
            }
          }
          l = r = 0;
        }else if(S.charAt(i+1) == 'R'){
          num[ir] = num[il] = (r+l)/2;
          if((r+l)%2 == 1){
            if((r > l && l%2 == 1) || (r < l && r%2 == 0)){
              num[il]++;
            }else{
              num[ir]++;
            }
          }
          l = r = 0;
        }
      }
    }
    
    for(int j = 0; j < N; j++){
      if(j < N-1){
        System.out.print(num[j]);
        System.out.print(" ");
      }else{
        System.out.println(num[j]);
      }
    }
  }
}