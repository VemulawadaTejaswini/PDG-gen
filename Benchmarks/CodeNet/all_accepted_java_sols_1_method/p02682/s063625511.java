import java.io.*;

class Main{
	public static void main(String []args)throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      	String str = br.readLine();
      	String s[] = str.split(" ");
      	int A = Integer.parseInt(s[0]);
      	int B = Integer.parseInt(s[1]);
      	int C = Integer.parseInt(s[2]);
      	int K = Integer.parseInt(s[3]);
      
      	int maxSum = 0;
      	
      	if(K - A >= 0)
          maxSum = A;
      	else{
          maxSum = K;
          K = 0;
        }
      	K = K - A;
      	if(K > 0)
          K = K - B;
      	if(K > 0)
          maxSum = maxSum + K * (-1);
      System.out.println(maxSum);
    }
}