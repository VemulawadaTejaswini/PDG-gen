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
            int t=Integer.parseInt(br.readLine());
            double pi=3.14159;
            System.out.println(2*pi*t);


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