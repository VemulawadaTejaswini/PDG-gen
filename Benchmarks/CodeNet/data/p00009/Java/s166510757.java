import java.io.*;

public class Main {
	public static void main(String[] args){
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		String line;
		try{
			while((line=reader.readLine()) != null){
				int x =Integer.parseInt(line);
				int[] p=new int[x+1];
				int[] q=new int[x+1];
				int n=0;
				for(int i =0;i<=x;i++){
					for(int j =1;j<=i;j++){
						if(i%j ==0){
							p[i] += 1;
						}else{
							q[i] += 1;
						}
					}
				}
				for(int i = 1;i<=x;i++){
					if(p[i] == 2){
					n += 1;
					}
				}
				System.out.println(n);
			}
			return 0;
		}catch(IOException e){
			System.out.println(e);
			System.exit(0);
		}catch(NumberFormatException e){
			System.exit(0);
		}
	}
}