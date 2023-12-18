import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    long H = sc.nextLong();
    long W = sc.nextLong();

    long ans = 10000000000l;
    if(H == 2 && W == 2){
      ans = 1;
    }
    for(int i = 1; i <= H-2; i++){
      long h1, h2;
      if((H-i) % 2 == 0){
        h1 = h2 = (H-i)/2;
      }else{
        h1 = (H-i)/2;
        h2 = h1 + 1;
      }
      
      long a1 = Math.max(i*W, Math.max(h1*W, h2*W));
      long a2 = Math.min(i*W, Math.min(h1*W, h2*W));
      
      if(a1-a2 < ans){
        ans = a1 - a2;
      }
    }

    for(int i = 1; i <= W-2; i++){
      long w1, w2;
      if((W-i) % 2 == 0){
        w1 = w2 = (W-i)/2;
      }else{
        w1 = (W-i)/2;
        w2 = w1 + 1;
      }
      long a1 = Math.max(i*H, Math.max(w1*H, w2*H));
      long a2 = Math.min(i*H, Math.min(w1*H, w2*H));
      if(a1-a2 < ans){
        ans = a1 - a2;
      }
    }
    
    for(int i = 1; i <= H-2; i++){
      long w1, w2;
      if(W % 2 == 0){
        w1 = w2 = W/2;
      }else{
        w1 = W/2;
        w2 = w1 + 1;
      }
      long a1 = Math.max(i*W, Math.max(w1*(H-i), w2*(H-i)));
      long a2 = Math.min(i*W, Math.min(w1*(H-i), w2*(H-i)));
      
      if(a1-a2 < ans){
        ans = a1 - a2;
      }
    }
    
    for(int i = 1; i <= W-2; i++){
      long h1, h2;
      if(H % 2 == 0){
        h1 = h2 = H/2;
      }else{
        h1 = H/2;
        h2 = h1 + 1;
      }
      long a1 = Math.max(i*H, Math.max(h1*(W-i), h2*(W-i)));
      long a2 = Math.min(i*H, Math.min(h1*(W-i), h2*(W-i)));
      if(a1-a2 < ans){
        ans = a1 - a2;
      }
    }
    System.out.println(ans);
  }
}