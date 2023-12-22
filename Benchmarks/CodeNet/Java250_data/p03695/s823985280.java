import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int box[] = new int[9];
    int N = sc.nextInt();
    
    for(int i = 0;i < 9;i++){
      box[i] = 0;
    }
    
    for(int i = 0;i < N;i++){
      int s = sc.nextInt();
      if(3200 <= s){
        box[8]++; 
      }else if(2800 <= s){
        box[7]++; 
      }else if(2400 <= s){
        box[6]++; 
      }else if(2000 <= s){
        box[5]++; 
      }else if(1600 <= s){
        box[4]++; 
      }else if(1200 <= s){
        box[3]++; 
      }else if(800 <= s){
        box[2]++; 
      }else if(400 <= s){
        box[1]++; 
      }else{
        box[0]++; 
      }
    }
    int min = 0;
    int max = 0;
    for(int i = 0;i < 8;i++){
      if(box[i] > 0)min++;
    }
    max = min+box[8];
    if(min == 0){
      min = 1;
    }
    System.out.println(min+" "+max);
  }
}