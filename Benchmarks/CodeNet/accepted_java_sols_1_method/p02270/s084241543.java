import java.util.*;
//import java.util.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int w[] = new int[n];
    int max = 0;
    int acc = 0;
    int left, right;
    int p;
    int sum = 0;
    int cnt = 0;
    
    for(int i = 0; i < n; i++){
        w[i] = sc.nextInt();
        acc = acc + w[i];
        max = Math.max(max,w[i]);
    }
    
    left = max;
    right = acc;
    while(left < right){
        p = (left + right) / 2;
        sum = 0;
        cnt = 0;
        
        for(int i = 0; i < n; i++){
            //System.out.println(i + " " + sum + " " + cnt + " " + p);
            if((sum + w[i]) > p){
                sum = w[i];
                cnt++;
            }else{
                sum = sum + w[i];
            }
            
            if(cnt == k){
                break;
            }
        }
        
        if(cnt == k){
            left = p + 1;
        }else{
            right = p;
        }
    }
//    System.out.println(sum + " " + max);
    System.out.println(left);


    }

}

