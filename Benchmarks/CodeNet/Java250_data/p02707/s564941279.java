import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class Main {
    public static void main(String[] args){
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            int n=Integer.parseInt(br.readLine());
            String[] ss=br.readLine().split(" ");
            int[] arr=new int[n];
            int[] c=new int[n];
            //System.out.println(n);
            for(int j=0;j<n-1;j++){
                arr[j]=Integer.parseInt(ss[j])-1;
                //System.out.println(arr[j]);
                c[arr[j]]+=1;

            }
            for(int j=0;j<n;j++){
                System.out.println(c[j]);
            }



        }catch(Exception e){
            System.out.println("KKKK "+e.getMessage());
        }
    }
    static boolean check(int[] arr){
        int odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                odd++;
            }
        }
        if(odd<=1){
            return true;
        }
        return false;
    }
}