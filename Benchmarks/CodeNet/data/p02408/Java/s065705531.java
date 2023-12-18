import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class Main{


	public static void main(String[] args){

		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

		//SHDC?????????????????????????????????
		int[] cardS=new int[13];
		int[] cardH=new int[13];
		int[] cardD=new int[13];
		int[] cardC=new int[13];
		Arrays.fill(cardS, 0);
		Arrays.fill(cardH, 0);
		Arrays.fill(cardD, 0);
		Arrays.fill(cardC, 0);

		try{
		int n=Integer.parseInt(reader.readLine());//n?????????

		for(int i=0;i<n;i++){
			String text=reader.readLine();
			String[] str=text.split(" ");
			int x=Integer.parseInt(str[1]);

			switch(str[0]){//???????????????????????????????????¨????????????1?????£??\???

			case"S":
				cardS[x-1]=1;
				break;
			case"H":
				cardH[x-1]=1;
				break;
			case"D":
				cardD[x-1]=1;
				break;
			case"C":
				cardC[x-1]=1;
				break;
			}
		}

		for(int i=0;i<13;i++){
			if(cardS[i]==0){
				System.out.println("S "+(i+1));
			}
		}
		for(int i=0;i<13;i++){
			if(cardH[i]==0){
				System.out.println("H "+(i+1));
			}
		}
		for(int i=0;i<13;i++){
			if(cardC[i]==0){
				System.out.println("C "+(i+1));
			}
		}
		for(int i=0;i<13;i++){
			if(cardD[i]==0){
				System.out.println("D "+(i+1));
			}
		}


		reader.close();

		}catch(IOException e){
			System.out.println("??¨??????"+e);
		}


	}

}