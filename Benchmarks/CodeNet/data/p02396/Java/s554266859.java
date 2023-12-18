import java.io.*;

class Main{
	public static void main(String[]args)throws IOException{
		
		int[] x;
		x=new int[10000];
		int i=0,j;
		
		do{
			i++;
			BufferedReader br=
			new BufferedReader(new InputStreamReader(System.in));
			
			String str=br.readLine();
			x[i]=Integer.parseInt(str);
		
		}while(x[i]!=0);
		
		for(j=1;j<i;j++){
			System.out.println("Case "+j+":"+x[j]);
		}
	}
}