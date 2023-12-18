import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferdReader input1 = new BufferedReader(new InpputStreamReader(System.in));
        String input2 = input1.readLine();
        String[] fac = input2.split("\\s+");
        int a = (int) fac[0];
        int b = (int) fac[1];
        int ab = a * b;
        int syu = 2 * (a + b);
        fac[0] = (String)ab;
        fac[1] = (String)syu;
        for(String w : fac){
            System.out.println(w + "\s+");
        }
    }
}
