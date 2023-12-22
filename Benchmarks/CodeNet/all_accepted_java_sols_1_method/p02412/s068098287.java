import java.io.*;

class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String[] str;
		int n,x;
		int num=0;

		while(true){
			str = buf.readLine().split(" ");
			n = Integer.parseInt(str[0]);
			x = Integer.parseInt(str[1]);
			if(n==0 && x==0)
				break;
			for(int i=1;i<=n;i++){
				for(int j=1;j<=n;j++){
					for(int k=1;k<=n;k++){
						if(i+j+k==x && i!=j && i!=k && j!=k){
							//System.out.printf("%d %d %d\n",i,j,k);
							num++;
						}
					}
				}
			}
			
			System.out.println(num/6);
			num = 0;
		}	

	}
}