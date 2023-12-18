import java.io.*;
public class Main {
   public static void main(String[] args) throws IOException{
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   String s;
	   while(true){
		   s = br.readLine();
		   if(s.equals("END OF INPUT")) break;
		   String[] ss = s.split(" ");
		   for(int i=0;i<ss.length;i++) System.out.print(ss[i].length());
		   System.out.println();
	   }
   }
}