import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int minheight = -1;
        long out = 0;
        
        
        for(int i =0; i<n; i++) {
          int height = sc.nextInt();
          if(minheight == -1) {
            minheight = height;
          }
          else {
            if(height < minheight) {
              out += (minheight-height);
            }
            if(height > minheight) {
              minheight = height;
            }
          }
        }
        
        System.out.println(out);
        
    }
}