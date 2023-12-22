import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name=br.readLine();
		int num;
		int compare;

		int[] a=new int[2];
		int i=0;

		int tmp;
		int x,y;
		while(true){

			try{

				StringTokenizer st=new StringTokenizer(name," ");
			     while (st.hasMoreTokens()) {
			    	 a[i]=Integer.parseInt(st.nextToken());
			    	 i++;
			     }i=0;

			     if (a[0] > a[1]) {
			            x = a[0];
			            y = a[1];
			        } else {
			            x = a[1];
			            y = a[0];
			        }

			     while((tmp=x%y)!=0){
			    	 tmp=x%y;
			    	 x = y;
			         y = tmp;
			     }

			     System.out.println(y+" "+a[0]/y*a[1]);
				a[0]=0;
				a[1]=0;
				x=0;
				y=0;
				tmp=0;
				name=br.readLine();
			}

			catch(Exception e){
				System.exit(0);
			}
		}
	}
}