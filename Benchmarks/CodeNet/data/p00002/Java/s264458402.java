import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main{
	public static void main(String[] args)throws IOException{
		String[] name=new String[200];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int[] num = null;
		int[] compare = null;
		int i=0;
		double a=0;

		while(true){
			name[i]=br.readLine();
			num[i]=name[i].indexOf(" ");
			compare[i]=(Integer.parseInt(name[i].substring(0,num[i])))+(Integer.parseInt(name[i].substring(num[i])));
			a=(double) compare[i];
			a=Math.log10(a);
			compare[i]=(int)a;
			System.out.println(compare[i]);
			i++;
		}
	}
}