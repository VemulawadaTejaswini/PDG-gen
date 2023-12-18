import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] s = new int[n];
        int [] t;
        for (int x = 0; x < n; x++){
            s[x] = scan.nextInt();
        }
        int q = scan.nextInt();
        t = new int[q];
        for (int x = 0; x < q; x++){
            t[x] = scan.nextInt();
        }
        int counter = 0;
        for (int x = 0; x < q; x++){
            if(t[x] <= s[n -1] && t[x] >= s[0]){
                if(binarysearch(s, 0, n - 1, t[x])){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
    public static boolean binarysearch(int arr[], int l, int r, int x){
        if(r >=l){
            int mid = (l + r)/2;
            if(arr[mid] == x){
                return true;
            }
            else if(arr[mid] > x){
                return binarysearch(arr, l, mid -1, x);
            }
            else{
                return binarysearch(arr, mid + 1, r, x);
            }
        }
        else{
         return false;
        }
    }
}
