
// import java.lang.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static List<Integer> al = new ArrayList<>();
    static int[] a;

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static Set<String> se = new HashSet<>();

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        // StringBuffer sb = new StringBuffer();
        // ArrayList<Integer> al=new ArrayList<>();
      
        // String s=sc.nextLine();



    //     int n=sc.nextInt();
    //     int x=sc.nextInt();
    //     int t=sc.nextInt();

    //     if(n>x)
    //     {
    //         if(n%x==0)
    //         System.out.println((n/x)*t);
    //         else
    //         {
    //             n /=x;
    //             System.out.println((n+1)*t);
    //         }

    //     }
    //   else
    //   System.out.println(t);


                int n=sc.nextInt();
                long[] a=new long[n];
                for(int i=0;i<n;i++)
                a[i]=sc.nextLong();
                long c=0;
                for(int i=0;i<n-1;i++)
                {
                    if(a[i]>a[i+1])
                   {
                       c += a[i]-a[i+1];
                       a[i+1]=a[i+1]+(a[i]-a[i+1]);
                       
                   }

                }
                System.out.println(c);
    }
   

  
    static int findCounts(int arr[], int n) {
        // Traverse all array elements
        int i = 0;
        while (i < n) {
            // If this element is already processed,
            // then nothing to do
            if (arr[i] <= 0) {
                i++;
                continue;
            }

            // Find index corresponding to this element
            // For example, index for 5 is 4
            int elementIndex = arr[i] - 1;

            // If the elementIndex has an element that is not
            // processed yet, then first store that element
            // to arr[i] so that we don't lose anything.
            if (arr[elementIndex] > 0) {
                arr[i] = arr[elementIndex];

                // After storing arr[elementIndex], change it
                // to store initial count of 'arr[i]'
                arr[elementIndex] = -1;
            } else {
                // If this is NOT first occurrence of arr[i],
                // then decrement its count.
                arr[elementIndex]--;

                // And initialize arr[i] as 0 means the element
                // 'i+1' is not seen so far
                arr[i] = 0;
                i++;
            }
        }
        int sum = 0;

        for (int j = 1; j < n; j++) {
            if (Math.abs(arr[j]) > 1)
                sum++;
        }
        return sum;
    }

    // public static String sortString(String inputString)
    // {
    // // convert input string to Character array
    // Character tempArray[] = new Character[inputString.length()];
    // for (int i = 0; i < inputString.length(); i++) {
    // tempArray[i] = inputString.charAt(i);
    // }

    // // Sort, ignoring case during sorting
    // Arrays.sort(tempArray, new Comparator<Character>(){

    // @Override
    // public int compare(Character c1, Character c2)
    // {
    // // ignoring case
    // return Character.compare(Character.toLowerCase(c1),
    // Character.toLowerCase(c2));
    // }
    // });

    // // using StringBuilder to convert Character array to String
    // StringBuilder sb = new StringBuilder(tempArray.length);
    // for (Character c : tempArray)
    // sb.append(c.charValue());

    // return sb.toString();
    // }

}