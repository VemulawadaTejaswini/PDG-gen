import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(;;){
			String s=br.readLine();
		    String[] st=s.split(" ");
			int a=Integer.parseInt(st[0]);
			int b=Integer.parseInt(st[1]);
			if(a==0&&b==0)break;
			for(int i=1;i<=a;i++){int m=0;
			
				if(i%2==1){System.out.print("#");m++;}
				for(int l=1;l<=b-m;l++){
					if(l%2==1)System.out.print(".");
					else System.out.print("#");					
				}
			 System.out.println();
			}System.out.println();
		}
		

	}
}