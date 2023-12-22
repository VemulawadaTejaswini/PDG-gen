import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int[] s = new int[n];
        for(int i=0; i<n; i++){
            s[i] = stdIn.nextInt();
        }

        int q = stdIn.nextInt();
        int[] t = new int[q];
        for(int i=0; i<q; i++){
            t[i] = stdIn.nextInt();
        }

        java.util.Arrays.sort(s);

        int counter = 0;
        for(int i=0; i<q; i++){
            if(binarySearch(s, t[i])){
                counter++;
            }
        }

        System.out.println(counter);
    }

    static boolean binarySearch(int[] a, int x){
        int from = 0;
        int to = a.length-1;
        int mid;
        do{
            mid = (from + to) / 2;
            if(x < a[mid]){
                to = mid - 1;
            }else{
                from = mid+1;
            }
        }while(x != a[mid] && from <= to);

        return (a[mid] == x);
    }
}
