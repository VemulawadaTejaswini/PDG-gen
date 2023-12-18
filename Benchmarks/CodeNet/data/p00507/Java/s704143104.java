import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] input = new String[n];
        int[] all = new int[n*(n-1)];

        for(int i = 0; i < n; i++){
            input[i] = br.readLine();
        }

        int index = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j) continue;
                all[index++] = Integer.parseInt(input[i] + input[j]);
            }
        }

        Arrays.sort(all);
        System.out.println(all[2]);
    }
}
