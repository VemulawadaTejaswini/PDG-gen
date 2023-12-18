import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int[] arr = new int[5];
        for(int i=0; i<5; i++)
            arr[i] = Integer.parseInt(s[i]);
        
        for(int i=0; i<5; i++) {
            if(arr[i] == 0) {
                System.out.print(i+1);
                return;
            }
        }
        System.out.print(-1);
    }
}