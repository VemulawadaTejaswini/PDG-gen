import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int sum=0;
        while((s = br.readLine())!=null){
            String[] str = s.split(" ");
            int m = Integer.parseInt(str[0]);
            int f = Integer.parseInt(str[1]);
            int r = Integer.parseInt(str[2]);
            if(m==-1 && f==-1 && r==-1){
                break;
            }else{
               sum = m + f;
                if(m<0 || f<0){
                    System.out.println("F");
                }else{
                    if(sum >= 80){
                        System.out.println("A");
                    }else if(sum>=65 && sum<80){
                        System.out.println("B");
                    }else if(sum>=50 && sum<65){
                        System.out.println("C");
                    }else if(sum>=30 && sum<50){
                        if(r>=50){
                            System.out.println("C");
                        }else{
                            System.out.println("D");
                        }
                    }else{
                        System.out.println("F");
                    }
                }
            }
        }
    }
}