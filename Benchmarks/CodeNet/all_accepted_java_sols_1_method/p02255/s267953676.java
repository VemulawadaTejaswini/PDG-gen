import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //入力
        int n = Integer.parseInt(sc.next());
        int[] list = new int[n];
        for(int i=0; i<n; i++){
            list[i] = Integer.parseInt(sc.next());
        }
        
        //ソート
        for(int i=0; i<n; i++){
            int v = list[i];
            int j = i-1;
            while(j>=0 && list[j] > v){
                list[j+1] = list[j];
                j--;
                list[j+1] = v;
            }
            //出力
            for(int k=0; k<n; k++){
                System.out.print(list[k]);
                if(k != n-1){
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

}

