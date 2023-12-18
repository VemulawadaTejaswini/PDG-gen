import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br
		= new BufferedReader(new InputStreamReader(System.in));

		
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++){
			char[][] data={br.readLine().toCharArray(),br.readLine().toCharArray()};
			plus(data);
		}
	}
	
	private static int plus(char[][] data){
		int [] sum=new int[data[0].length >data[1].length ? data[0].length:data[1].length];
		if(sum.length>=80){
			System.out.println("overflow");
			return 0;
		}
		for(int i=0;i<data.length;i++){
			for(int j=(data[i].length-1),k=0;j>=0;j--,k++){
				sum[k]+=data[i][j]-'0';
			}
		}
		if(sum.length>=79 && sum[0]>=10){
			System.out.println("overflow");
			return 0;
		}
		for(int i=1;i<sum.length;i++){
			if(sum[i-1]>=10){
				sum[i]++;
				sum[i-1]%=10;
			}
		}
		for(int i=sum.length-1;i>=0;i--){
			System.out.print(sum[i]);
		}
		System.out.println();
		return 1;
	}
}