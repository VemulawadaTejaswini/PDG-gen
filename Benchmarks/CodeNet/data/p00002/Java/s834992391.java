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

		while(true){

			try{
				StringTokenizer st=new StringTokenizer(name," ");
				compare=Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
				System.out.println(String.valueOf( compare ).length());
				name=br.readLine();
			}

			catch(Exception e){
				System.exit(0);
			}
		}
	}
}