import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int j = 0; j < n; j++){
            double[] posx = new double[4];
            double[] posy = new double[4];
            String[] input = br.readLine().split(" " , 8);

            for(int i = 0; i < 4; i++){
                posx[i] = Double.parseDouble(input[2*i]);
                posy[i] = Double.parseDouble(input[2*i+1]);
            }

            boolean isPara = false;

            if((posx[0]==posx[1]) && (posx[2]==posx[3]))         isPara = true;
            else if((posy[0]==posy[1]) && (posy[2]==posy[3]))    isPara = true;
            else {
                double vectorA = (posy[1]-posy[0]) * (posy[3]-posy[2]);
                double vectorB = (posy[3]-posy[2]) * (posx[1]-posx[0]); 
                if(vectorA == vectorB) isPara = true;
            }
            
            if(isPara)  System.out.println("YES");
            else        System.out.println("NO");

        }
    }

}