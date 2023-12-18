import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str;
		while((str=br.readLine())!=null){
			int back=0;
			int n=Integer.parseInt(str);
			if(n>36){
				System.out.println(back);
				continue;
			}
			
			for(int a=0;a<=9;a++){
				for(int b=0;b<=9;b++){
					for(int c=0;c<=9;c++){
						for(int d=0;d<=9;d++){
							if(a+b+c+d==n){
								back++;
							}
						}
					}
				}
			}
			
			System.out.println(back);
		}
	}

}