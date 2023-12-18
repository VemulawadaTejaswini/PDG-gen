import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
		
		int n=Integer.parseInt(br.readLine());
		int [] in=new int[n];
		int min=1000000000;int max=0;
		int nummin=0; int nummax=0;
		for(int i=0;i<n;i++)
			in[i]=Integer.parseInt(br.readLine());
			
		for(int i=0;i<n-1;n++){
			for(int j=0;j<n;j++){
				int tmp=in[i]-in[j];
				if(tmp>nummax) nummax=tmp;
			}
		}
System.out.println(nummax);




	}

}