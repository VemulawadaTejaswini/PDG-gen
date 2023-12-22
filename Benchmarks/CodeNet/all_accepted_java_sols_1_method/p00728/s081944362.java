import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      int ave;
      int n = 0;
      int i;
      while(true){
        n = sc.nextInt();
        if(n == 0){
          break;
        } 
      int data[] = new int [n];
      ave = 0;
      int most = 0,least = 1000;
      for(i=0;i<n;i++){
        data[i] = sc.nextInt();
        if(most <= data[i]) {
          most = data[i];
        }
        if(data[i] <= least) {
          least = data[i];
          
      }
      
      ave += data[i];
    }

      ave = (ave-(most+least))/(n-2);
      
      System.out.println(ave);
    }
    }
  }
