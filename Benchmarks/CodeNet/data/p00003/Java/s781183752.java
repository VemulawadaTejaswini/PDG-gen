import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name=br.readLine();
		int kaz=Integer.parseInt(name);
		int num;
		int compare;

		int[] a=new int[3];
		int big;
		int i=0;

		for(int j=0; j<kaz; j++){
			name=br.readLine();
			try{
				StringTokenizer st=new StringTokenizer(name," ");
			     while (st.hasMoreTokens()) {
			    	 a[i]=Integer.parseInt(st.nextToken());
			    	 i++;
			     }i=0;
			     a[0]*=a[0]; a[1]*=a[1]; a[2]*=a[2];
				big = Math.max((Math.max(a[0], a[1])),(Math.max(a[0], a[2])));

				if(big==a[0]){
					if(a[0]==a[1]+a[2]){
						System.out.println("YES");
					}
					else{
						System.out.println("NO");
					}
				}

				else if(big==a[1]){
					if(a[1]==a[2]+a[0]){
						System.out.println("YES");
					}
					else{
						System.out.println("NO");
					}
				}

				else if(big==a[2]){
					if(a[2]==a[1]+a[0]){
						System.out.println("YES");
					}
					else{
						System.out.println("NO");
					}
				}

				a[0]=0;
				a[1]=0;
				a[2]=0;


			}

			catch(Exception e){
				System.exit(0);
			}
		}
	}
}