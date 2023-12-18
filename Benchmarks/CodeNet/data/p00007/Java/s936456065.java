import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
  
class Main { 
    public static void main(String[] args)throws IOException { 
        //????????±??° 
        int n = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in), 64).readLine());  
        //?¨?????????? 
        int result = 100000; 
          
        //n??±???????????????????¨???? 
        //0??±??????????¨????????????¨??? 
        if (n != 0) { 
            for(int i = 1; i < n;i++){ 
                result =(int)(result + (result * 0.05)); 
                if((result % 1000) != 0 ){ 
                    result = ((int)(result / 1000) + 1) * 1000; 
                } 
            } 
        } 
        System.out.println(result); 
    } 
}