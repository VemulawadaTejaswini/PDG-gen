import java.util.*;
import java.io.*;
import java.lang.*;
class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n  = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int count  = 0;
        HashSet<String> set = new HashSet<>();
        ArrayList<String> alist = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(j!=i){
                    for(int k=j+1;k<n;k++){
                        if(k!=j&&k!=i){
                            if(arr[i]+arr[j]>arr[k]&&arr[k]+arr[j]>arr[i]&&arr[i]+arr[k]>arr[j] && arr[i]!=arr[j] && arr[j]!=arr[k]&&arr[i]!=arr[k]){
                                count++;
                                //set.add(arr[i]+" "+arr[j]+" "+arr[k]);
                                //alist.add(arr[i]+" "+arr[j]+" "+arr[k]);
                            }
                        }
                    }
                }
            }
        }
        // for(String string:alist){
        //     System.out.println(string);
        // }
        System.out.println(count);
    }
}