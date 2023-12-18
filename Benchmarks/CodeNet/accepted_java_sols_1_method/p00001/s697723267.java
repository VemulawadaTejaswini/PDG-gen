import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] data = new int[10];

        for(int i=0; i<10; i++){
            data[i] = Integer.parseInt(br.readLine());
        }
        for(int i=0; i<3; i++){
            int maxIndex = i;
            for(int k=i+1; k<10; k++){
                if(data[maxIndex] < data[k]){
                    maxIndex = k;
                }
            }
            int tmp = data[maxIndex];
            data[maxIndex] = data[i];
            data[i] = tmp;
        }
        for(int i=0; i<3; i++){
            System.out.println(data[i]);
        }
    }
}