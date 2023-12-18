import java.io.*;
public class Main{  
    public static void main(String[] args) throws IOException{
        BufferedReader bf = 
            new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(" ");
        int A = Integer.parseInt(str[0]),
            B = Integer.parseInt(str[1]),
            C = Integer.parseInt(str[2]);
        boolean b = A < C && C < B || B < C && C < A;
        if(b){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}