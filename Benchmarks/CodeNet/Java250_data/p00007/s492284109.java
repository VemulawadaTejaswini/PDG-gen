import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name;
		int num;
		double prc=100;
		long hen=0;
		while(true){

			try{
				prc=100;
				hen=0;
				num=0;

				name=br.readLine();
				num=Integer.parseInt(name);

				for(int i=0; i<num; i++){
					prc*=1.05;
					prc=Math.ceil(prc);
				}

				hen=(long) prc;
				System.out.println(hen*1000);

			}

			catch(Exception e){
				System.exit(0);
			}
		}
	}
}