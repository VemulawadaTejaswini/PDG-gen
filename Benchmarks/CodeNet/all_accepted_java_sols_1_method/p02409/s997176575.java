import java.io.*;

public class Main{
    public static void main(String[] arg)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int p,b,f,r,v;
		int room[][]=new int[13][11];

		String str=br.readLine();
		if(str.equals("")) System.exit(0);
		int n=Integer.parseInt(str);
	
		String[] strArray;  
		//Arrays.fill(room,0); //room[][]に初期値0を設定
		
		for(int i=1;i<=n;i++){
			str=br.readLine();
			strArray=str.split(" ");
			b=Integer.parseInt(strArray[0]);
			f=Integer.parseInt(strArray[1]);
			r=Integer.parseInt(strArray[2]);
			v=Integer.parseInt(strArray[3]);
			
			
			room[(b-1)*3+f][r]+=v;
		}
        StringBuilder output = new StringBuilder();
		//出力
        boolean div =false;
 		for (int i=1;i<=12;i++){
			p=1;
			while (p<=10){
				output.append(" "+ room[i][p]);
				p++;
			}
			output.append("\n");
			switch (i){
				case 3:	
					div=true;
					break;
				case 6:
					div=true;
					break;
				case 9:
					div=true;
					break;
				default:div=false;
				break;
			}
			
			if(div==true){
				output.append("####################\n");
				div=false;}
			
		}
 		output.delete(output.length()-1,output.length());
		System.out.println(output);
	}

}