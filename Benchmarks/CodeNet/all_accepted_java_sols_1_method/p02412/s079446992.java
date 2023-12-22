import java.io.*;
public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true){
		String str = br.readLine();
		String[] i=str.split(" ");
		int n=Integer.parseInt(i[0]),x=Integer.parseInt(i[1]),count=0;
		if(n==0&&x==0){break;}
		for (int a=1;a<=n;a++){
			for (int b=2;b<=n;b++){
				for(int c=3;c<=n;c++){
					if(a+b+c==x&&(a<b&&b<c)){count+=1;}
				}
			}
		}
		System.out.println(count);
		}
	}
}