import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final String egara ="4";
        final String number = "13";
        int[][] num = new int[Integer.parseInt(egara)][Integer.parseInt(number)];
        String[] tp = {"S","H","C","D"};
        int n = Integer.parseInt(br.readLine());
        String s;
        int count = 0;
        while((s=br.readLine())!=null || count!=n){
            count++;
            String[] str = s.split(" ");
            String y = str[0];
            int x = Integer.parseInt(str[1]);
            switch(y){
                case "S": num[0][x-1] = x; break;
                case "H": num[1][x-1] = x; break;
                case "C": num[2][x-1] = x; break;
                case "D": num[3][x-1] = x; break;
            }
        }
        for (int i=0;i<Integer.parseInt(egara);i++){
            for (int j=0;j<Integer.parseInt(number);j++){
                if(num[i][j]==0) {
                    System.out.println(tp[i] +" "+ (j+1));
                }
            }
        }
    }
}