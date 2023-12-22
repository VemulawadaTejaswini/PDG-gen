import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String kosu=br.readLine();
		int nako=Integer.parseInt(kosu);
		int[] suji=new int[nako];
		String[] egara=new String[nako];

		for(int j=0; j<nako; j++){
			String strArr[] = br.readLine().split(" ");
			egara[j]=(strArr[0]);
			suji[j]=Integer.parseInt(strArr[1]);
			
		}

		int[] trump=new int[52];
		int tmp=0;

		for(int i=0; i<52; i++){
			trump[i]=0;
		}

		for(int i=0; i<nako; i++){

			if(egara[i].equals("S")){
				tmp=-1;
				tmp+=suji[i];
			}
			else if(egara[i].equals("H")){
				tmp=12;
				tmp+=suji[i];
			}
			else if(egara[i].equals("C")){
				tmp=25;
				tmp+=suji[i];
			}
			else if(egara[i].equals("D")){
				tmp=38;
				tmp+=suji[i];
			}

			trump[tmp]=1;
		}


		int[] none_card=new int[52-nako];
		int none_count=0;

		for(int i=0; i<52; i++){
			if(trump[i]==0){
				none_card[none_count]=i+1;
				none_count++;
			}
			else{}
		}

		for(int i=0; i<52-nako; i++){
			if((none_card[i]-1)/13==0){
				if(none_card[i]%13==0){
					System.out.println("S 13");
				}
				else{
					System.out.println("S "+none_card[i]%13);
				}
			}

			else if((none_card[i]-1)/13==1){
				if(none_card[i]%13==0){
				System.out.println("H 13");
				}
				else{
					System.out.println("H "+none_card[i]%13);
				}
			}

			else if((none_card[i]-1)/13==2){
				if(none_card[i]%13==0){
					System.out.println("C 13");
					}
					else{
						System.out.println("C "+none_card[i]%13);
					}
			}

			else if((none_card[i]-1)/13==3){
				if(none_card[i]%13==0){
					System.out.println("D 13");
					}
					else{
						System.out.println("D "+none_card[i]%13);
					}
			}
		}
	}
}