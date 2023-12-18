import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[100];
        for(int i = 0 ; i < 100 ; i++)
            num[i] = 0;
        int max = 0;
        while(sc.hasNext()){
            int a = sc.nextInt();
            num[a-1]++;
            max = Math.max(max,num[a-1]);
        }
        for(int i = 0 ; i < 100 ; i++){
            if(num[i] == max)
                System.out.println(i+1);
        }
    }
}
