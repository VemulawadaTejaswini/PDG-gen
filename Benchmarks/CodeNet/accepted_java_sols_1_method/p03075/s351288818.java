import java.util.*;
import java.lang.Math;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] x = {0,0,0,0,0,0};
        //         a,b,c,d,e
        for(int i = 0; i < x.length ; i++){
            x[i] = sc.nextInt();
        }
        int judge = 0;
        for(int i = 0;i < x.length-1;i++){
            for(int j = 1; j < x.length;j++){
                if(Math.abs(x[i] - x[j]) > x[5]){
                    judge = 1;
                }
            }
        }
        if(judge == 1){
            System.out.println(":(");
        }else{
            System.out.println("Yay!");
        }

    }
}