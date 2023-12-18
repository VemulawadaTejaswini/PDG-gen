import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int[] S = new int[n];
        for(int i = 0; i < n; i++){
            S[i] = Integer.parseInt(s[i]);
        }
        int q = Integer.parseInt(br.readLine());
        String[] t = br.readLine().split(" ");
        int[] T = new int[q];
        for(int i = 0; i < q; i++){
            T[i] = Integer.parseInt(t[i]);
        }

        int ans = 0;

        //??°???T???????´??????????????????°???S??¨?????????????????????????????????Binary search??§)         
        for(int i = 0; i < T.length; i++){
            if(binarySearch(T[i], S)){
                ans++;
            }
        }
        System.out.println(ans);
    }

    public static boolean binarySearch(int key, int[] target){
        int left = 0;
        int right = target.length;
        int middle;

        while(left < right){
            middle = (left + right) / 2;
            if(key < target[middle]) right = middle;
            if(key == target[middle]) return true;
            if(key > target[middle]) left = middle + 1;
        }
        return false;
    }

}