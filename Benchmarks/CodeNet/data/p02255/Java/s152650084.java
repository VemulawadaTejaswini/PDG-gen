import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String we = br.readLine();
            String line = br.readLine();
            String[] w = line.split("\\s");
            int[] arr = new int[w.length];
            
            System.out.println(line);
            for(int i=0; i<w.length; i++){
                arr[i] = Integer.parseInt(w[i]);
            }
            
            insertSort(arr);
            
        }catch(IOException e) {
            e.printStackTrace();
        }
        
    }
    public static void insertSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            insert(i, arr);
        }
    }
    
    public static void insert(int i, int[] arr){
        int tmp = arr[i];
        for(int j=i-1; j>=0; j--){
            if (arr[j] > tmp){
                arr[j + 1] = arr[j];
                arr[j] = tmp;
            } else {
                arr[j + 1] = tmp;
                break;
            }
        }
        String[] line = new String[arr.length];
        for(int o=0; o<arr.length; o++){
            line[o] = String.valueOf(arr[o]);
        }
        System.out.println(String.join(" ", line));
    }
}

