import java.io.*;

 public class Main{
	 public static void main(String args[]) throws IOException{
		 BufferedReader bf = new BufferedReader(
				 new InputStreamReader(System.in));
		 int w,n,right,left,x;
		 String str;
		 w = Integer.parseInt(bf.readLine());
		 n = Integer.parseInt(bf.readLine());
		 int[] order = new int[w];
		 for(int i = 0; i < w; i++){
			 order[i] = i+1;
		 }
		 for(int i = 0; i < 2*n; i += 2){
			 str = bf.readLine();
			 String deta[] = str.split(",",0);
			 left = Integer.parseInt(deta[0]);
			 right = Integer.parseInt(deta[1]);
			 x = order[left-1];
			 order[left-1] =order[right-1];
			 order[right-1] = x;
		 }
		 for(int i = 0; i < w; i++){
			 System.out.println(order[i]);
		 }
	 }
}