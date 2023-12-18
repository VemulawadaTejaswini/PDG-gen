import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    private static FastScanner fs = new FastScanner();
    public static void main(String[] args) {

       int n = fs.nextInt();
       boolean hasD = false;
       int arr[] = new int[101];
       for(int i=3;i<(n+3);i++)
       {
           int a = fs.nextInt();
           int b = fs.nextInt();
           if(a==b) arr[i] =1;
       }
       boolean hasY = false;
       for(int i=3;i<=98;i++)
       {
           if(arr[i]==1 && arr[i+1]==1 && arr[i+2]==1)
           {
               hasY = true;
               break;
           }
       }
       if(hasY) System.out.println("Yes");
       else System.out.println("No");
    }


    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
        int  gcd(int a,int b)
        {
            while (b > 0)
            {
                int  temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
        private int upper(int arr[],int key){
            int low = 0;
            int high = arr.length-1;
            while(low < high){
                int mid = low + (high - low+1)/2;
                if(arr[mid] <= key){
                    low = mid;
                }
                else{
                    high = mid-1;
                }
            }
            return low;
        }
        public int lower(int arr[],int key){
            int low = 0;
            int high = arr.length-1;
            while(low < high){
                int mid = low + (high - low)/2;
                if(arr[mid] >= key){
                    high = mid;
                }
                else{
                    low = mid+1;
                }
            }
            return low;
        }
    }
}