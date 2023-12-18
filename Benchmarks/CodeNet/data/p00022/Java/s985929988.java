import java.io.*;
class Main{
	public static void main(String[] args)throws IOException{
		int n;
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		while((n=Integer.parseInt(br.readLine()))!=0){
			int[] data_set=new int[n];
			int max;
			max=data_set[0]=Integer.parseInt(br.readLine());
			for(int i=1;i<data_set.length;i++){
				max=Math.max(data_set[i]=(Integer.parseInt(br.readLine())),max);
			}
			for(int i=1;i<data_set.length;i++){
				for(int j=0;j<(data_set.length - i);j++){
					max=Math.max(max,calc_max(data_set,i,j));
				}
			}
			System.out.printf("%d\n",max);
		}
	}
	public static int calc_max(int[] data,int n,int m){
		int ans=0;
		for(int i=0;i<n+1;i++){
			ans+=data[m+i];
		}
		return ans;
	
	}		
}