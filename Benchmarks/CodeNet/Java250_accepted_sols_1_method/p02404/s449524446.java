import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name;
		int num;
		int compare;
		String waku="";
		String wk2="#";

		int[] a=new int[2];
		int i=0;
		while(true){

			try{
				name=br.readLine();
				StringTokenizer st=new StringTokenizer(name," ");
				while (st.hasMoreTokens()) {
					a[i]=Integer.parseInt(st.nextToken());
					i++;
				}i=0;

				if(a[0]==0 && a[1]==0){
					System.exit(0);
				}

				else if(a[0] != 1){
					for(int k=0; k<a[1]; k++){
						waku=waku+"#";
					}

					for(int k=0; k<a[1]-2; k++){
						wk2=wk2+".";
					}wk2=wk2+"#";

					System.out.println(waku);
					for(int j=0; j<a[0]-2; j++){
						System.out.println(wk2);
					}
					System.out.println(waku);
					System.out.println("");
					waku="";
					wk2="#";
				}

				else if(a[0]==1){
					for(int k=0; k<a[1]; k++){
						waku=waku+"#";
					}

					System.out.println(waku);
					System.out.println("");
					waku="";
					wk2="#";
				}
			}

			catch(Exception e){
				System.exit(0);
			}
		}
	}
}