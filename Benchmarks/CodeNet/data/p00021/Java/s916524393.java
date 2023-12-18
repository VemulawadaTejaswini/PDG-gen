import java.io.*;
class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br
		= new BufferedReader(new InputStreamReader(System.in));
		String buf;
		double[][] data=new double[4][2];
		int n=Integer.parseInt(br.readLine());
		for(int k=0;k<n;k++){
			if((buf=br.readLine())==null)break;
			if(buf.length()==0)break;
			
			String[] buf2=buf.split(" ");
			for(int i=0;i<4;i++){
				for(int j=0;j<2;j++){
					data[i][j]=Double.parseDouble(buf2[i*2+j]);
				}
			}
			if((data[0][1]-data[1][1]/data[0][0]-data[1][0])==(data[2][1]-data[3][1]/data[2][0]-data[3][0]))
					System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}