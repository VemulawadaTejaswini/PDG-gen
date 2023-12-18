import java.io.*;

 public class Main{
	 public static void main(String args[]) throws IOException{
		 BufferedReader bf = new BufferedReader(
				 new InputStreamReader(System.in));
		 int i = 0, j = 0,x;
		 int order[] = new int[10];
		 int exit[] = new int[10];
		 String str;
		 while((str = bf.readLine()) != null){
			 x = Integer.parseInt(str);
			 if(x != 0){
				 order[i] = x;
				 i++;
			 } else {
				 exit[j] = order[i-1];
				 j++;
				 i--;
			 }
		 }
		 for(int c = 0; c < j; c++){
			 System.out.println(exit[c]);
		 }
	 }
}