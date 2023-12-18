import java.io.*;
import java.util.ArrayList;
class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		String str=br.readLine();
		int n=Integer.parseInt(str);
		
		ArrayList<String>list=new ArrayList<>();
		
		for(int i=0;i<n;i++){
			list.add(br.readLine());
		}
		for(int j=0;j<4;j++){
			for(int k=0;k<13;k++){
				if(j==0){
					if (list.contains("S " +(k+1)) == false) {
						sb.append("S ").append(k+1).append("\n");
					}
				}
				else if(j==1){
					if (list.contains("H " +(k+1)) == false) {
						sb.append("H ").append(k+1).append("\n");
					}
				}
				else if(j==2){
					if (list.contains("C " +(k+1)) == false) {
						sb.append("C ").append(k+1).append("\n");
					}
				}
				else if(j==3){
					if (list.contains("D " +(k+1)) == false) {
						sb.append("D ").append(k+1).append("\n");
					}
				}
			}
		}
		System.out.print(sb);
	}
}