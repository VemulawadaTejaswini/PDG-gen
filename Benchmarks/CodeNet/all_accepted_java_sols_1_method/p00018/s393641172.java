import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		int[] p = new int[5];
		int n;
		String t;
		String[] ps = new String[5];
		while((t=bf.readLine())!=null){
			ps=t.split(" ");
			for(int i=0;i<5;i++)p[i]=Integer.parseInt(ps[i]);
			for(int i=0;i<5;i++){
				for(int j=4;j>i;j--){
					if(p[j]>p[j-1]){n=p[j];p[j]=p[j-1];p[j-1]=n;}
				}
			}
			for(int i=0;i<5;i++)System.out.print((i>0?" ":"")+p[i]);
			System.out.print("\n");
		}

	}
}