import java.util.*;
public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        int n =sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            set.add(arr[i]);
        }
        int ans =0;
        for(int i=1;i<n;i++){
            if(arr[i] == arr[i-1]){
                ans++;
                for(int ii=1;ii<=10000;ii++) {
                    if(!set.contains(ii)) { arr[i] = ii; break; }
                }
            }
        }
        System.out.println(ans);
    }
}
