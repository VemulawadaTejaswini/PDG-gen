import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");
        int[] list = new int[3];
        for (int i = 0; i < 3; i++) {
            list[i] = Integer.parseInt(lines[i]);
        }
        for (int i = 0; i < 2; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (list[i] > list[j]) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        for(int i=0;i<3;i++){
            System.out.print(list[i]);
            if(i!=2){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}