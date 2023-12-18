package aoj;

import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str;
		while((str=br.readLine())!=null){
			int num=Integer.parseInt(str);
			int backNum=0;	
			for(int i=2;i<=num;i++){
				boolean isPrime=true;
				for(int j=2;j<=Math.sqrt(i);j++){
					if(i%j==0){
						isPrime=false;
						break;
					}
				}
				if(isPrime){
					backNum++;
				}
			}
			
			System.out.println(backNum);
		}
	}

}