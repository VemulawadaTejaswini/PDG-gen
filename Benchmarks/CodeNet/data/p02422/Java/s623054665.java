import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

         
        while((str = br.readLine()) != null){
            String abcde = str;
            str = br.readLine();
            int num = Integer.parseInt(str);
            for(int i =0;i < num;i++){
                str = br.readLine();
                String[] temp = str.split("\\s");
                if(temp[0].equals("replace")){
                    //replace
                    int a = Integer.parseInt(temp[1]);
                    int b = Integer.parseInt(temp[2]);
                    String c = temp[3];
                    abcde = rep(abcde,a,b,c);

                }else if(temp[0].equals("reverse")){
                    //reverse
                    int a = Integer.parseInt(temp[1]);
                    int b = Integer.parseInt(temp[2]);
                    abcde = rev(abcde,a,b);

                }else{
                    //print
                    int a = Integer.parseInt(temp[1]);
                    int b = Integer.parseInt(temp[2]);                             
                    abcde = pr(abcde,a,b);
                    System.out.println(abcde);
                }
            }
        }
        br.close();
                  
    }

    public String rep(String abcde,int a,int b,String c){
        String x = abcde.substring(a,b+1);
        String ans = abcde.replace(x,c);
        return ans;
    }

    public String rev(String abcde,int a,int b){
        String x = abcde.substring(a,b+1);
        StringBuilder sb = new StringBuilder(x);
        sb.reverse();
        String y = sb.toString();
        String ans = abcde.replace(x,y);
        return ans;
    }

    public String pr(String abcde,int a,int b){
        String ans = abcde.substring(a,b+1);
        return ans;
    }




}