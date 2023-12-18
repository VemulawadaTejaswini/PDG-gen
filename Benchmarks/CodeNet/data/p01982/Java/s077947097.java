import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class Main{
	public static void main(String[] args)throws IOException{
		File fi=new File("./B");
		FileReader fr=new FileReader(fi);
		BufferedReader bfr=new BufferedReader(fr);
		
		File of=new File("./resB.txt");
		FileWriter fw=new FileWriter("./resB.txt");
		PrintWriter pw=new PrintWriter(new BufferedWriter(fw));
		of.createNewFile();
		
		String line="";
		int[] abya;
		int s=0,g=0;
		int kosu=0;
		int Uryu=0;
		String[] pp;
		
		while(true){
			line=bfr.readLine();
			if(line.equals("0 0 0")){
				break;
			}
			pp=line.split(" ");
			kosu=Integer.parseInt(pp[0]);
			abya=new int[kosu+1];
			s=Integer.parseInt(pp[1]);
			g=Integer.parseInt(pp[2]);
			Uryu=0;
			abya[kosu]=1;
			
			for(int i=0; i<kosu; i++){
				abya[i]=Integer.parseInt(bfr.readLine());
			}
			
			for(int i=s; i<=g; i++){
				for(int j=0; j<=kosu; j++){	//それぞれの条件のループを回す
					if(j%2==0){
						if(i%abya[j]==0){
							Uryu++;
							break;
						}
					}
					else if(j%2==1){
						if(i%abya[j]==0){
							break;
						}
					}
				}
			}
			pw.println(Uryu);
		}
		pw.close();
	}
}
