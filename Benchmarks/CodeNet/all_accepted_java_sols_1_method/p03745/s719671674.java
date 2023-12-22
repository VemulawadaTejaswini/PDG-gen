import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String linea = in.readLine();
		while(linea!=null&&!linea.trim().equals("")){
			int n=Integer.parseInt(linea);
			int arr[]=new int [n];
			StringTokenizer toks = new StringTokenizer(in.readLine());
			for (int i = 0; i < n; i++) 
				arr[i]=Integer.parseInt(toks.nextToken());
			boolean crece=false;
			boolean decrece=false;
			int tam=1;
			int cont=0;
			for (int i = 0; i < arr.length-1; i++) {
				if(crece){
					if(arr[i]<=arr[i+1]){
						tam++;
					}else{
						cont++;
						crece=false;
						//decrece=true;
						tam=0;
						if(i==arr.length-2){
							
						}
						//i++;
					}
				}else if(decrece){
					if(arr[i]>=arr[i+1]){
						tam++;
					}else{
						cont++;
						decrece=false;
						//crece=true;
						tam=0;
						//i++;
					}
				}else{
					if(arr[i]<arr[i+1]){
						crece=true;
						tam++;
					}else if(arr[i]>arr[i+1]){
						decrece=true;
						tam++;
					}else tam++;
				}
			}
			
//			if(crece){
//				if(arr[arr.length-2]<=arr[arr.length-1]){
//					tam++;
//				}else{
//					cont++;
//					crece=false;
//					//decrece=true;
//					tam=0;
//					//i++;
//				}
//			}else if(decrece){
//				if(arr[i]>=arr[i+1]){
//					tam++;
//				}else{
//					cont++;
//					decrece=false;
//					//crece=true;
//					tam=0;
//					//i++;
//				}
//			}else{
//				if(arr[i]<arr[i+1]){
//					crece=true;
//					tam++;
//				}else if(arr[i]>arr[i+1]){
//					decrece=true;
//					tam++;
//				}else tam++;
//			}
//			//if(arr[arr.length-2])
//			if(tam>0)cont++;
			
			out.println(++cont);
			linea=in.readLine();
		}
		
		in.close();
		out.close();
	}
}
