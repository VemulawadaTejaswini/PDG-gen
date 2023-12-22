import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String s=reader.readLine();
			String[] t;
			t=s.split(" ");
			int n,m;
			n=Integer.parseInt(t[0]);
			m=Integer.parseInt(t[1]);
			if(n==0 &&m==0){
				System.exit(0);
			}
			int ansta=0;
			int ansha=0;
			int[] Sta=new int[n];
			int[] Sha=new int[m];
			for(int i=0;i<n;i++){
				Sta[i]=Integer.parseInt(reader.readLine());
			}
			for(int j=0;j<m;j++){
				Sha[j]=Integer.parseInt(reader.readLine());
			}
			int Sumsta=0;
			int Sumsha=0;
			for(int k=0;k<n;k++){
				Sumsta+=Sta[k];
			}
			for(int l=0;l<m;l++){
				Sumsha+=Sha[l];
			}
			int dif;
			if(Sumsha<Sumsta){
				dif=Sumsta-Sumsha;
			}else{
				dif=Sumsha-Sumsta;
			}
			label:
			for(int p=0;p<n;p++){
				for(int q=0;q<m;q++){
					if(Sumsha==Sumsta){
						if(Sta[p]==Sha[q]){
							ansta=Sta[p];
							ansha=Sha[q];
							break label;
						}
					}
					if(Sumsha<Sumsta){
						if(Sha[q]<Sta[p]){
							if((Sta[p]-Sha[q])*2==dif){
								ansta=Sta[p];
								ansha=Sha[q];
								break label;
							}
						}
					}else{
						if(Sha[q]>Sta[p]){
							if((Sha[q]-Sta[p])*2==dif){
								ansta=Sta[p];
								ansha=Sha[q];
								break label;
							}
						}
					}
				}
			}
			if(ansta==0 &&ansha==0){
				System.out.println("-1");
			}else{
				System.out.println(ansta+" "+ansha);
			}
		}
	}
}	