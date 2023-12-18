import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int q = Integer.parseInt(input[1]);

        int[] scores = new int[n];
        for(int i = 0; i < n; i++){
            scores[i] = 0;
        }

        for(int i = 0; i < q; i++){
            String[] line = br.readLine().split(" ");
            scores[Integer.parseInt(line[0]) - 1] += Integer.parseInt(line[1]);

            int person = -1;
            int max = -1;
            for(int j = 0; j < n; j++){
                if(scores[j] > max){
                    person = j;
                    max = scores[j];
                }
            }

            System.out.println((person+1) + " " + max);
        }

    }
}
