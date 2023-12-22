import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt(),N = sc.nextInt();
        int min = 114514893;
        int ans = -1;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<N;i++){
            int temp = sc.nextInt();
            set.add(temp);
        }
        for(int i=-200;i<=200;i++){
            if(set.contains(i)){
                continue;
            }
            if(Math.abs(i-X)<min){
                min = Math.abs(i-X);
                ans = i;
            }else if(Math.abs(i-X)==min&&i<ans){
                //System.out.println(ans+"ss"+i);
                ans = i;
            }
        }
        System.out.println(ans);

    }
}
