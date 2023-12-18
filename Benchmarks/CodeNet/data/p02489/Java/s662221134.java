import java.io.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

 class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
 
StringBuilder sb = new StringBuilder();

    for(int i = 0 ;  ; i++){
        String str = in.readLine();
        int num = Integer.parseInt(str);
        if(num == 0) break;
        sb.append("Case " + (i+1) + ": " + num +"\n");
    }
    System.out.print(sb);
}
}