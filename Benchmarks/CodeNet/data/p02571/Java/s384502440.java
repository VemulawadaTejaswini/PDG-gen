import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] c1 = sc.next().toCharArray();
        char[] c2 = sc.next().toCharArray();
        int num1 = c1.length;
        int num2 = c2.length;
        int count = 0;
        
        for(int i=0; i<(num1-num2+1); i++){
          int cc = 0;
          for(int j=0; j<c2.length; j++){
              if(c1[i+j]==c2[j]){
                  cc++;
              }
          }
          if(count<cc){
              count = cc;
              //System.out.println("i "+ i);
              //System.out.println("cc "+ cc);
              
          }
        }

        System.out.println(num2-count);
        
    }
}