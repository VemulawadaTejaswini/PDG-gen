import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(maxDif(arr));
    }
    private static int maxDif(int[] arr){
        int min = arr[0],
            maxDif = Integer.MIN_VALUE;

        for(int i=1; i<arr.length; i++){
            if(arr[i] - min > maxDif) maxDif = arr[i] - min;
            if(arr[i] < min)min = arr[i];
        }
        return maxDif;
      }

}