import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int K = Integer.parseInt(sc.next());
    String S = sc.next();
    char[] c1 = S.toCharArray();
    char[] c2 = S.toCharArray();
    char[] c3 = S.toCharArray();
    char[] c4 = S.toCharArray();
    boolean flag = false;
    int count = 0;
    for(int i = 0; i < N; i++){
      if(flag && c1[i] == 'R'){
        flag = false;
        count++;
      }
      if(count == K){
        break;
      }
      
      if(c1[i] == 'L'){
        flag = true;
        c1[i] = 'R';
      }
    }
    flag = false;
    count = 0;
    for(int i = 0; i < N; i++){
      if(flag && c3[i] == 'L'){
        flag = false;
        count++;
      }
      if(count == K){
        break;
      }
      
      if(c3[i] == 'R'){
        flag = true;
        c3[i] = 'L';
      }
    }
    
    flag = false;
    count = 0;
    for(int i = N-1; i >= 0; i--){
      if(flag && c2[i] == 'L'){
        flag = false;
        count++;
      }
      if(count == K){
        break;
      }
      
      if(c2[i] == 'R'){
        flag = true;
        c2[i] = 'L';
      }
    }
    
    flag = false;
    count = 0;
    for(int i = N-1; i >= 0; i--){
      if(flag && c4[i] == 'R'){
        flag = false;
        count++;
      }
      if(count == K){
        break;
      }
      
      if(c4[i] == 'L'){
        flag = true;
        c4[i] = 'R';
      }
    }
    
    String S1 = new String(c1);
    String S2 = new String(c2);
    String S3 = new String(c3);
    String S4 = new String(c4);
    
    count = 1;
    int sum1 = 0;
    char bef = S1.charAt(0);
    for(int i = 1; i < N; i++){
      if(S1.charAt(i) == bef){
        count++;
        if(i == N-1){
          sum1 += count-1;
        }
      }else{
        bef = S1.charAt(i);
        sum1 += count-1;
        count = 1;
      }
    }
    count = 1;
    int sum2 = 0;
    bef = S2.charAt(0);
    for(int i = 1; i < N; i++){
      if(S2.charAt(i) == bef){
        count++;
        if(i == N-1){
          sum2 += count-1;
        }
      }else{
        bef = S2.charAt(i);
        sum2 += count-1;
        count = 1;
      }
    }
    
    count = 1;
    int sum3 = 0;
    bef = S3.charAt(0);
    for(int i = 1; i < N; i++){
      if(S3.charAt(i) == bef){
        count++;
        if(i == N-1){
          sum3 += count-1;
        }
      }else{
        bef = S3.charAt(i);
        sum3 += count-1;
        count = 1;
      }
    }
    
    count = 1;
    int sum4 = 0;
    bef = S4.charAt(0);
    for(int i = 1; i < N; i++){
      if(S4.charAt(i) == bef){
        count++;
        if(i == N-1){
          sum4 += count-1;
        }
      }else{
        bef = S4.charAt(i);
        sum4 += count-1;
        count = 1;
      }
    }
    
    System.out.println(Math.max(sum1, Math.max(sum2, Math.max(sum3, sum4))));
  }
}