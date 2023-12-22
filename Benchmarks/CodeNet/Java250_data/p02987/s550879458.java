import java.util.*;
import java.io.*;



public class Main{
    static int INFTY=Integer.MAX_VALUE;
    public static void main (String args[]){
        //初期処理
        Scanner sc=new Scanner(System.in);
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // try{
            // int n = Integer.parseInt(br.readLine());
            
        String str = sc.nextLine();
        char[] arr= new char[4];
        arr[0]=str.charAt(0);
        arr[1]=str.charAt(1);
        arr[2]=str.charAt(2);
        arr[3]=str.charAt(3);

        boolean bool =false;
        if(arr[0]==arr[1]){
            if(arr[2]==arr[3]&&arr[0]!=arr[2]){
                bool=true;   
            }
        }
        if(arr[0]==arr[2]){
            if(arr[1]==arr[3]&&arr[0]!=arr[1]){
                bool=true;   
            }
        }
        if(arr[0]==arr[3]){
            if(arr[1]==arr[2]&&arr[0]!=arr[2]){
                bool=true;   
            }
        }
        if(bool==true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}