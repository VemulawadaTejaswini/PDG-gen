import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br
		= new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String buf;
			if((buf=br.readLine())==null)break;
			if(buf.length()==0)break;
			int d=Integer.parseInt(buf);
			int s=0;
			for(int i=0;i<(600/d);i++){
				s+=(d)*Math.pow((d*i),2);
			}
			System.out.println(s);
		}
	}
}