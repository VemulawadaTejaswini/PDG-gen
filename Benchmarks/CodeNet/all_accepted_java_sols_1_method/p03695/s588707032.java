import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int a[] = new int[n];
    int c[] = {0,0,0,0,0,0,0,0,0};
    
    for(int i = 0 ; i < n ; ++i){
      a[i] = sc.nextInt();
            
      if(a[i] < 400) c[0]++;
      else if(a[i] < 800) c[1]++;
      else if(a[i] < 1200) c[2]++;
      else if(a[i] < 1600) c[3]++;
      else if(a[i] < 2000) c[4]++;
      else if(a[i] < 2400) c[5]++;
      else if(a[i] < 2800) c[6]++;
      else if(a[i] < 3200) c[7]++;
      else c[8]++;
    }
    
    int min = 0;
    
    for(int i = 0 ; i < 8 ; ++i){
      if(c[i] != 0){
        min++;
      }
    }
    
    int max = min + c[8];
    if(min == 0) min++;
    
    System.out.println(min+" "+max);

  }
}