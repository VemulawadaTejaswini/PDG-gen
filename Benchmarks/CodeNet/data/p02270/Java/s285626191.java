import java.io.*;


public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
		try{
			String str=br.readLine();
			int n=Integer.parseInt(str.split(" ")[0]);
			int k=Integer.parseInt(str.split(" ")[1]);
			int[] in=new int[n];
			for(int i=0;i<n;i++) in[i]=Integer.parseInt(br.readLine());
			
			sortA(in);
			int[] track=new int[k];
			for(int i=0;i<n;i++){
				track[0]+=in[i];
				sortB(track);
			}
			System.out.println(track[track.length-1]);
			
		}catch(IOException e){
			
		}




	}
	static void sortA(int[] in){
		int tmp=0;
		for(int i=0;i<in.length-1;i++){
			for(int j=i+1;j<in.length;j++){
				if(in[i]<in[j]){
					tmp=in[j];
					in[j]=in[i];
					in[i]=tmp;
				}
			}
		}
	}
	static void sortB(int[] in){
		
		if(in[0]>in[1]){
			int tmp=in[0];
			
			for(int i=1;i<in.length;i++){
				if(tmp<=in[i])break;
				in[i-1]=in[i];
				in[i]=tmp;
				
			}
		}
	}}