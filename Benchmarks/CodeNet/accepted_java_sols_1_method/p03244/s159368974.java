import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int num = scan.nextInt();
        int[] up = new int[100001];
        int[] down = new int[100001];
        for(int i = 0; i < num; i++){
            if(i % 2 == 1){
                up[scan.nextInt()] += 1;
            } else {
                down[scan.nextInt()] += 1;
            }
        }

        // search
        int upFirst = 0;
        int upSecond = 0;
        int downFirst = 0;
        int downSecond = 0;
        for(int i = 1; i <= 100000; i++){
            if(up[i] > up[upFirst]){
                upSecond = upFirst;
                upFirst = i;
            } else if(up[i] > up[upSecond]){
                upSecond = i;
            }
            if(down[i] > down[downFirst]){
                downSecond = downFirst;
                downFirst = i;
            } else if(down[i] > down[downSecond]){
                downSecond = i;
            }
        }

        // answer
        int min = 0;
        if(upFirst != downFirst){
            min = num - up[upFirst] - down[downFirst];
        } else {
            min = num - up[upFirst] - down[downSecond];
            if(num - down[downFirst] - up[upSecond] < min){
                min = num - down[downFirst] - up[upSecond];
            }
        }    
        System.out.println(min);

    }
}