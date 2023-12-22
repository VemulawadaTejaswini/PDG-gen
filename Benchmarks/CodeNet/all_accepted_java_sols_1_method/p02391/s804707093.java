import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader mBufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String str=mBufferedReader.readLine();
        String[] arr=str.split(" ");
        
        int a=Integer.parseInt(arr[0]);
        int b=Integer.parseInt(arr[1]);
     
        if(a>b){
            System.out.println("a > b");
        }else if(a<b){
            System.out.println("a < b");
        }else{
            System.out.println("a == b");
        }
    }
}
