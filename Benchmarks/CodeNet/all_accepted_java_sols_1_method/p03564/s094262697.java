import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int num =1;
        
        for(int i = 0;i<n;i++){
            num = Math.min(num*2,num+k);
            //System.out.println(num);
        }
        System.out.println(num);
    }
}


