
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
    static Set<Integer> s=new HashSet<>();

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        //  StringBuffer sb = new StringBuffer();
      
            // String r=s.substring(0,q)+y+s.substring(q);
            // System.out.println(r);
            // int n=sc.nextInt();
            // int k=sc.nextInt();
            // int[] a=new int[n];
            // // ArrayList<Integer> a=new ArrayList<>();
            // for(int i=0;i<n;i++)
            // a[i]=(sc.nextInt());
            // int sum=0,c=0;
            // int l=0;
          
            
            String s=sc.nextLine();

            int c=0;
            boolean flag=false;
            for(int i=0;i<s.length();i++ )
           { if(s.charAt(i)=='R')
           {
               c=1;
               break;
           }
            }
            for(int i=0;i<s.length()-1;i++)
            {
                
                if(s.charAt(i)=='R' && s.charAt(i+1)=='R')
                c++;
            }
            
            System.out.println(c);
        
           
            

            
    
       

    }


    static void chess(int n,int m,int x,int y)
    {
        if(x<0|| y<0 ||x>=n||y>=m)
        return;

        System.out.print(x+" "+y);

        chess(n, m, x, y-1);
        chess(n, m, x-1, y);
        chess(n, m, x, y+1);
        chess(n, m, x+1, y);
    }
    // public static int countFrequencies(ArrayList<Integer> list) 
    // { 
    //     // hashmap to store the frequency of element 
    //     Map<Integer, Integer> hm = new HashMap<>(); 
  
    //     for (Integer i : list) { 
    //         Integer j = hm.get(i); 
    //         hm.put(i, (j == null) ? 1 : j + 1); 
    //     } 
    //     int sum=0;
  
    //     // displaying the occurrence of elements in the arraylist 
    //     for (Map.Entry<Integer, Integer> val : hm.entrySet()) { 
            
    //         if(val.getKey()>1){
    //             sum++;

    //         }
    //     } 
    //     return sum;
    // } 

   static int findCounts(int arr[], int n)  
    { 
        // Traverse all array elements 
        int i = 0; 
        while (i < n)  
        { 
            // If this element is already processed, 
            // then nothing to do 
            if (arr[i] <= 0)  
            { 
                i++; 
                continue; 
            } 
  
            // Find index corresponding to this element 
            // For example, index for 5 is 4 
            int elementIndex = arr[i] - 1; 
  
            // If the elementIndex has an element that is not 
            // processed yet, then first store that element 
            // to arr[i] so that we don't lose anything. 
            if (arr[elementIndex] > 0)  
            { 
                arr[i] = arr[elementIndex]; 
  
                // After storing arr[elementIndex], change it 
                // to store initial count of 'arr[i]' 
                arr[elementIndex] = -1; 
            }  
            else 
            { 
                // If this is NOT first occurrence of arr[i], 
                // then decrement its count. 
                arr[elementIndex]--; 
  
                // And initialize arr[i] as 0 means the element 
                // 'i+1' is not seen so far 
                arr[i] = 0; 
                i++; 
            } 
        } 
        int sum=0;
  
      
        for (int j = 1; j < n; j++) 
           { if( Math.abs(arr[j])>1)
            sum++; }
            return sum;
    } 


   
        
    




    // public static String sortString(String inputString) 
    // { 
    //     // convert input string to Character array 
    //     Character tempArray[] = new Character[inputString.length()]; 
    //     for (int i = 0; i < inputString.length(); i++) { 
    //         tempArray[i] = inputString.charAt(i); 
    //     } 
          
          
    //     // Sort, ignoring case during sorting 
    //     Arrays.sort(tempArray, new Comparator<Character>(){ 
  
    //         @Override
    //         public int compare(Character c1, Character c2) 
    //         { 
    //             // ignoring case 
    //             return Character.compare(Character.toLowerCase(c1), 
    //                                     Character.toLowerCase(c2)); 
    //         } 
    //     }); 
          
    //     // using StringBuilder to convert Character array to String 
    //     StringBuilder sb = new StringBuilder(tempArray.length); 
    //     for (Character c : tempArray) 
    //         sb.append(c.charValue()); 
  
    //     return sb.toString(); 
    // } 
      
}