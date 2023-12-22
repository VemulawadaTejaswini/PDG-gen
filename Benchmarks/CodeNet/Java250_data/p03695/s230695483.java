import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean[] color = new boolean[8];
    int free = 0;
    int count = 0;
    for(int i=0;i<n;i++){
      int x = sc.nextInt();
      if(1<=x && x<=399){
        if(!color[0]){
          count++;
        }
        color[0] = true;
      }else if(400<=x && x<=799){
        if(!color[1]){
          count++;
        }
        color[1] = true;
      }else if(800<=x && x<=1199){
        if(!color[2]){
          count++;
        }
        color[2] = true;
      }else if(1200<=x && x<=1599){
        if(!color[3]){
          count++;
        }
        color[3] = true;
      }else if(1600<=x && x<=1999){
        if(!color[4]){
          count++;
        }
        color[4] = true;
      }else if(2000<=x && x<=2399){
        if(!color[5]){
          count++;
        }
        color[5] = true;
      }else if(2400<=x && x<=2799){
        if(!color[6]){
          count++;
        }
        color[6] = true;
      }else if(2800<=x && x<=3199){
        if(!color[7]){
          count++;
        }
        color[7] = true;
      }else{
        free++;
      }
    }

    int min = count;
    int max = count+free;
    if(min==0){
      min = 1;
      max = n;
    }
    
      System.out.println(min+" "+max);
  }
}