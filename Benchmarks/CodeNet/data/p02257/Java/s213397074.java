import java.io.*;
import java.util.*;

//height 違う
public class Main{
    static int count =0;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        str = br.readLine();
        
        int N = Integer.parseInt(str);

        int ans = 0;
        //int[] num = new int[N];
        for(int i=0;i<N;i++){
            str = br.readLine();
            //num[i] = Integer.parseInt(str);
            if(run(Integer.parseInt(str)) == 2){
                ans ++;
            }
        }

        System.out.println(ans);

    }
    public static int run(int a){
        if(a == 0){
            return 100;
        }
        if(a != 2){
            if(a % 2 ==0){
                return 100;
            }
        }
        if(a != 3){
            if(a % 3 ==0){
                return 100;
            }
        }

        int count = 0;
        for(int i=1;i<=a;i++){
            if(a % i ==0){
                count ++;
            }
        }
        return count;
    }
}


