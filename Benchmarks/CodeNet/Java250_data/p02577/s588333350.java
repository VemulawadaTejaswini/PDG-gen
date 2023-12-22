    import java.util.*;
    import java.io.*;
     
    public class Main {
      public static void main(String[] args) throws IOException{
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        
        String s = rd.readLine();
        for (int i = 0; i < s.length(); i++) {
          int val = Integer.parseInt(Character.toString(s.charAt(i)));
          arr[val]++;
        }
        
        int sum = 0;
        for (int i = 1; i < 10; i++)
          	sum += (arr[i] * i);
        
        if (sum % 9 == 0)
          System.out.print("Yes");
        else
          System.out.print("No");
      }
    }