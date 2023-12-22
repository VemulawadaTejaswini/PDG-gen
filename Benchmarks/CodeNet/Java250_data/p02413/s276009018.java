import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        
        int f = 0;
        int r = Integer.parseInt(line[0]);
        int c = Integer.parseInt(line[1]);
        int num[][] = new int[r][c];
        int sum_r[] = new int[r];
        int sum_c[] = new int[c];

        for (int a = 0; a < r; a++) {
            String[] line1 = br.readLine().split(" ");
            for (int b = 0; b < c; b++) {                
                num[a][b] = Integer.parseInt(line1[b]);
            }
        }
        
        for (int a = 0; a < r; a++) {
            for (int b = 0; b < c; b++) {                
                sum_r[a] += num[a][b];
            }            
        }
        
        for (int b = 0; b < c; b++) {
            for (int a = 0; a < r; a++) {                
                sum_c[b] += num[a][b];
            }            
        }
        
        for(int a = 0; a < r; a++) {
            f += sum_r[a];
        }

        for(int x = 0; x < r + 1; x++) {
            if(x != r) {               
                for(int y = 0; y < c + 1; y++) {
                    if(y != c) { System.out.print(num[x][y] + " "); }
                    else { System.out.println(sum_r[x]); }
                }                            
            }
            
            else {
                for(int z = 0; z < c + 1; z++) {
                    if(z != c){
                        System.out.print(sum_c[z] + " ");
                    }
                    else {
                        System.out.println(f); 
                    }
                }
            }
        }
        

    }

}