import java.util.*;
import java.io.*;
 
class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long sum=0;
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        int n = Integer.parseInt(br.readLine());
        String[]str = br.readLine().split(" ");
        //String s = br.readLine();
        //String[] str = s.split(" ");
         
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(str[i]);
            if(max < num) max = num;
            if(min > num) min = num;
            sum += num;
        }
        System.out.println(min+" "+max+" "+sum);
    }
}