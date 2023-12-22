import java.io.*;
class Main {
    public static void main(String[] args) {
        try {
           BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
           String[] s = reader.readLine().split(" ");
           int[] a = new int[5];
           for(int i = 0;i < a.length;i++) {
        	   a[i] = Integer.parseInt(s[i]);
           }
           for(int i = 0;i < a.length;i++) {
        	   int m = i;
        	   for(int j = i+1;j < a.length;j++) {
        		   if(a[m] < a[j])
        			   m = j;
        	   }
        	   int tmp = a[i];
        	   a[i] = a[m];
        	   a[m] = tmp;
           }
           for(int i = 0;i < a.length;i++) {
                   System.out.print(a[i]);
            	   if(i < a.length-1)
            		   System.out.print(" ");
           }
           System.out.println("");

         }
         catch(IOException e) {
          System.out.println(e);
         }
    }
}