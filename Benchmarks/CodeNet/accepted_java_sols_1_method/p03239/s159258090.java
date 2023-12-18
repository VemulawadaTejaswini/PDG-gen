import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int cost = 9999;

        for(int i = 0;i<n;i++){
            int c = sc.nextInt();
            int t2 = sc.nextInt();
            if(t>=t2){
                if(cost>c){
                    cost=c;
                }
            }
        }

        if(cost==9999){
            System.out.println("TLE");
        }else{
            System.out.println(cost);
        }


        
    }
}
