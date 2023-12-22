import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int m=Integer.parseInt(br.readLine());
		int[] line=new int[n];
		for(int i=0;i<n;i++){
			line[i]=i+1;
		}
		for(int i=0;i<m;i++){
			String buf2=br.readLine();
			String[] buf=buf2.split(",");
			int[] data=new int[2];
			for(int j=0;j<2;j++)	data[j]=(Integer.parseInt(buf[j])-1);
		int temp=line[data[0]];
		line[data[0]]=line[data[1]];
		line[data[1]]=temp;
		}
		for(int i=0;i<n;i++){
			System.out.println(line[i]);
		}
	}
}