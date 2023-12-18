import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String s;
		String[] t;
		int[] n=new int[2];
		while((s=reader.readLine())!=null){
			t=s.split(" ");
			for(int i=0;i<2;i++){
				n[i]=Integer.parseInt(t[i]);
			}
			if(n[0]<n[1]){
				System.out.println("a < b");
			}else if(n[0]==n[1]){
				System.out.println("a == b");
			}else{
				System.out.println("a > b");
			}
		}
	}
}