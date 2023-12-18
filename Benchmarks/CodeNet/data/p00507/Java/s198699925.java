import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());

        String[] input = new String[num];
        String[] data = new String[num * (num-1)];

        for(int i = 0; i < num; i++)    input[i] = br.readLine();

        int index = -1;
        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                if(i != j){
                    data[++index] = input[i] + input[j];
                }
            }
        }

        Arrays.sort(data);
        for(String i : data){
            System.out.println(i);
        }

        System.out.println(data[2]);
    }
}