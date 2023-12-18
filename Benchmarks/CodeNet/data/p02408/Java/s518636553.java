import java.io.*;
class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int i,j;
		int[][] list=new int[4][13];
		for(i=0;i<4;i++){
			for(j=0;j<13;j++){
				list[i][j]=0;
			}
		}
		String str=br.readLine();
		int n=Integer.parseInt(str);
		for(i=0;i<n;i++){
			String[] card=br.readLine().split(" ");
			String mark=card[0];
			int num=Integer.parseInt(card[1]);
			if(mark.equals("S")){
				list[0][num-1]=1;
			}
			else if(mark.equals("H")){
				list[1][num-1]=1;
			}
			else if(mark.equals("C")){
				list[2][num-1]=1;
			}
			else if(mark.equals("D")){
				list[3][num-1]=1;
			}
		}
		for(i=0;i<4;i++){
			for(j=0;j<13;j++){
				if(list[i][j]==0){
					if(i==0){
						sb.append("S ").append(j+1).append("\n");
					}
					else if(i==1){
						sb.append("H ").append(j+1).append("\n");
					}
					else if(i==2){
						sb.append("C ").append(j+1).append("\n");
					}
					else if(i==3){
						sb.append("D ").append(j+1).append("\n");
					}
				}
			}
		}
		System.out.print(sb);
	}
}