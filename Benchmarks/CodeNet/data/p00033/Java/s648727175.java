import java.util.Scanner;

/**
 * Created by The Illsionist on 2018/1/6.
 */
public class AOJ0033 {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] array = new int[10];
        int preB = -1,preC = -1;
        while(N-- > 0){
            for(int i = 0;i < 10;i++){
                array[i] = input.nextInt();
            }
            if(dfs(preB,preC,0,array))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
    
    public static boolean dfs(int preB,int preC,int i,int[] array){
        if(i == 10)
            return true;
        if(array[i] > preB && array[i] < preC){
            return dfs(array[i],preC,i + 1,array);
        }else if(array[i] > preC && array[i] < preB){
            return dfs(preB,array[i],i + i,array);
        }else if(array[i] > preB && array[i] > preC){
            return dfs(array[i],preC,i + 1,array) || dfs(preB,array[i],i + i,array);
        }else
            return false;
    }
}
