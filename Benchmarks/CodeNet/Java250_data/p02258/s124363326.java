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
            maxDif = arr[1] - min;
            if(min > arr[1])min = arr[1];

        for(int i=2; i<arr.length; i++){
            if(arr[i] - min > maxDif) maxDif = arr[i] - min;
            else if(arr[i] < min)min = arr[i];
        }
        return maxDif;
      }
}