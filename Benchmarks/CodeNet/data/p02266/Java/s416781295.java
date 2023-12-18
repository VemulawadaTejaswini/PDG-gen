import java.io.*;

class Main{
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			int i;
			int data[] = new int[str.length()];
			for(i=0; i<str.length(); i++){
				switch (str.charAt(i)){
					case '\\':data[i]=-1;break;
					case '/' :data[i]= 1;break;
					case '_' :data[i]= 0;break;
				}
			}
			int start=0, end=0, saveEnd, base=0;
			int A=0, Li=0, k=0;
			int L[] = new int[str.length()];
			while(true){
				for(i=base; i<data.length; i++){
					saveEnd=end;
					end+=data[i];
					if(data[i]==-1||data[i]==1){
						Li++;
					}
					if(data[i]==0){
						Li+=2;
					}
					Li+=(start-(end<saveEnd?end:saveEnd)-1)*2;
					if(start>end){
					} else if(start<end){
						start=end;
						Li=0;
						base=i+1;
					} else{
						if(Li>0){
							A+=Li/2;
							L[k]=Li/2;
							k++;
							Li=0;
						}
						base=i+1;
					}
				}
				base++;
				if(base>=data.length) break;
				start--;
				end=start;
				Li=0;
			}
			System.out.println(A);
			System.out.print(k);
			for(i=0; i<k; i++){
				System.out.print(" "+L[i]);
			}
		} catch(IOException e){
			System.out.println("Exception :" + e);
		}
	}
}