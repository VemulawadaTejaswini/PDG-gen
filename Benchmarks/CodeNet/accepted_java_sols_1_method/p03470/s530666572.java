import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args){
        int n = 0;
        int[] d = null;
        int[] b = new int[101];
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
            n = Integer.parseInt(s);
            d = new int[n];
            for(int i=0;i<n;i++){
                d[i] = Integer.parseInt(reader.readLine());
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        int c=0;
        for(int i=0;i<n;i++){
            b[d[i]]++;
            if(b[d[i]] == 1){
                c++;
            }
        }
        System.out.println(c);
    }
}