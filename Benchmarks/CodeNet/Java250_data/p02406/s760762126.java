import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name;
		int num;

		while(true){

			try{
				name=br.readLine();
				num=Integer.parseInt(name);
				nabat(num);
			}

			catch(Exception e){
				System.exit(0);
			}
		}
	}

	public static int nabat(int a){
		int p=a;
		boolean pass=false;
		String nk="";
		int kak=0;

		for(int i=1; i<p+1; i++){
			if(i%3==0 && pass==false){
				System.out.print(" "+i);
				pass=true;
			}
			else if(pass== false){
				nk=i+"";
				kak=nk.indexOf("3");
				if(kak!=-1){
					System.out.print(" "+i);
					pass=true;
				}
			}
			pass=false;
		}
		System.out.println("");
		return 0;
	}
}