import java.io.*;
class Main{
  	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();
        int count=0,max=0;
        int n = s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='R')
                count++;
            else
                count=0;
            if(count>max)
                max = count;
        }
      System.out.println(max);
    }
}