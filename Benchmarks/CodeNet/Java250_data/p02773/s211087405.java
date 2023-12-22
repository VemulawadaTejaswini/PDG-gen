import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        String[] list = new String[n];
        int count = 1;
        int max = 1;
        List<String> ans = new ArrayList<String>();
        for(int i = 0; i < n ; i++){
            list[i] = input.readLine();
        }
        Arrays.sort(list);
        for(int j = 0; j < n ; j++){
            if(j > 0){
                if (list[j].equals(list[j-1])){
                    count++;
                }else{
                    count = 1;
                }
            }
            if(max < count){
                max = count;
            }
        }
        Arrays.sort(list);
        count = 1;
        for(int k = 0; k < n ; k++){
            if(k > 0){
                if (list[k].equals(list[k-1])){
                    count++;
                }else{
                    count = 1;
                }
            }
            if(max == count){
                ans.add(list[k]);
            }
        }
        for(int l = 0; l < ans.size(); l++){
        System.out.println(ans.get(l));
        }

    }
}