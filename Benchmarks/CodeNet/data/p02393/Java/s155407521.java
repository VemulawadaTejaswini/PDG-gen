import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

  class Main{
    public static void main(String[] args){
    try{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String[] arr  = str.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        int temp = 0;
        if(a>b){
           temp= a ;
            a=b;
           b= temp;
         }if(b>c){
          
           temp = b;
           b=c;
           c=temp;
        }if(a>b){
            temp= a ;
            a=b;
           b= temp;
            }
        System.out.println(a+" "+b+" "+c);
    }catch(IOException e){
     e.printStackTrace();
    }
}
}