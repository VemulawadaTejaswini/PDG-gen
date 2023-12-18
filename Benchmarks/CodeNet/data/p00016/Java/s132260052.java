import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br
		= new BufferedReader(new InputStreamReader(System.in));
		double x=0.0,y=0.0;
		int b=90;
		while(true){
			String buf=br.readLine();
			String[] buf2=buf.split(",");
			int[] data=new int[2];
			for(int i=0;i<data.length;i++)
				data[i]=Integer.parseInt(buf2[i]);
			if(data[0]==0&&data[1]==0)break;
			x+=(double)data[0]*Math.cos(((double)b*Math.PI)/180.0);
			y+=(double)data[0]*Math.sin(((double)b*Math.PI)/180.0);
			b-=data[1];
		}
		System.out.println((int)x);
		System.out.println((int)y);
	}
}