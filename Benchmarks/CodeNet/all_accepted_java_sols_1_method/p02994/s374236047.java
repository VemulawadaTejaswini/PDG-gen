import java.util.*;

public class Main{
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int l = Integer.parseInt(sc.next());
        int data[] = new int[n];
        int sum = 0;
        int min = Integer.MAX_VALUE;
        boolean minFlag = true;
        for(int i = 0;i<n;i++){
            data[i] = l + i;
            sum += data[i];
            if(data[i] < 0){
                data[i] *= -1;
                minFlag = false;
            }else{
                minFlag = true;
            }
            min = Math.min(min,data[i]);
        }
        if(minFlag == false){
            min *= -1;
        }
        System.out.println(sum - min);
    }
}