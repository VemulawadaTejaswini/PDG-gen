import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str;
		final int x=600;
		while((str=br.readLine())!=null){
			int d=Integer.parseInt(str);
			int circle=x/d;
			
			int s=0;
			for(int i=1;i<circle;i++){
				int ux=d*i;
				int hight=ux*ux;
				/*System.out.println(ux);*/
				s+=hight*d;
			}
			System.out.println(s);
		}
	}

}