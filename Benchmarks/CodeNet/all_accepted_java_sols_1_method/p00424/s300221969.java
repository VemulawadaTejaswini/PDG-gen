import java.io.*;

class Main{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			while(true){
				String line = reader.readLine();
				int n = Integer.parseInt(line);
				if(n==0)break;
				char[] bcon; char[] acon;
				bcon = new char[n];
				acon = new char[n];
				for(int i = 0;i < n;++i){
					line = reader.readLine();
					bcon[i] = line.charAt(0);
					acon[i] = line.charAt(2);
					//System.out.println(bcon[i]+" "+acon[i]);
				}
				line = reader.readLine();
				int m = Integer.parseInt(line);
				for(int i = 0;i < m;++i){
					line = reader.readLine();
					char con  = line.charAt(0);
					int j = 0;
					do{
						if(con == bcon[j]){
							System.out.printf("%c",acon[j]);break;
						}else if(j+1 == n){
							System.out.printf("%c",con);break;
						}
						j++;
					}while(j < n);
					
				}
				System.out.println();
			}
		}catch(IOException e){
				System.out.println(e);
		}
	}
}