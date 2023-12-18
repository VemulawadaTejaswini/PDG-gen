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
		String waku2="";

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

				else{
					for(int k=0; k<a[1]; k++){
						if(k%2==0){
							waku=waku+"#";
							waku2=waku2+".";
						}
						if(k%2==1){
							waku=waku+".";
							waku2=waku2+"#";
						}
					}

					for(int j=0; j<a[0]; j++){
						if(j%2==0)System.out.println(waku);
						if(j%2==1)System.out.println(waku2);
					}
					System.out.println("");
					waku="";
					waku2="";
				}
			}

			catch(Exception e){
				System.exit(0);
			}
		}
	}
}