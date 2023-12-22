import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count = 0;
        int high = 0;
        int[] mt = new int[num];

        for(int i = 0;i < num;i++){
            mt[i] = sc.nextInt();
        }

        high = mt[0];
        for(int i = 0;i < num;i++){
            if(high <= mt[i]){
                count++;
            }
            if(high < mt[i]){
                high = mt[i];
            }
            
        }
        System.out.println(count);
    }
}