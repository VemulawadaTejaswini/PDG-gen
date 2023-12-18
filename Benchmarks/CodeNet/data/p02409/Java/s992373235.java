import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            int n = Integer.parseInt(reader.readLine());
            int i = 0;
            int[][] a = new int[12][10];
            for(int j = 0; j<12;j++){
                for(int k = 0; k<10;k++){
                    a[j][k] = 0;
                }
            } 
            while(i < n){
                String line = reader.readLine();
                String[] str = line.split(" ");
                int b = Integer.parseInt(str[0]);
                int f = Integer.parseInt(str[1]);
                int r = Integer.parseInt(str[2]);
                int v = Integer.parseInt(str[3]);

                a[(b - 1) * 3 + f -1][r - 1] += v;
                i++;
            }

            for(int j = 0; j<12; j++){
                for(int k = 0; k< 10; k++){
                    System.out.print(" " + a[j][k]);
                }
                System.out.println();
                if(j%3 == 2 && j != 11){
                    for(int l = 0; l < 20;l++){
                        System.out.print("#");
                    }
                    System.out.println();
                }
            }
        }catch(IOException e){
        
        }
    }
}
