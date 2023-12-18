import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i;
        int j;
        while(true){
            //String s = br.readLine();
            String[] str = br.readLine().split(" ");
            int h = Integer.parseInt(str[0]);
            int w = Integer.parseInt(str[1]);
            if(h == 0 || w == 0) break;
            for(i=0;i<h; i++){
                System.out.print("");
                for(j=0; j<w-1; j++){
                    if((i%2!=0 && j%2==0) ^ (i%2==0 && j%2!=0)){
                        System.out.print(".");
                    }else /*if((i%2==0 && j%2!=0) ^ ())*/{
                        System.out.print("#");
                    }
                   
                }
                if((i%2!=0 && j%2==0) ^ (i%2==0 && j%2!=0)){
                    System.out.println(".");
                }else{
                    System.out.println("#");
                }
                //int sum = i + j;
                //System.out.println(sum);
            }
            System.out.print("\n");
        }
    }
}