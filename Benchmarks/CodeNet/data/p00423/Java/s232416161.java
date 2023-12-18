import java.io.*;
public class Main {
	public static void main(String[] args){
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int ah,bh;
		int as=0,bs=0;
		int[] as_a=new int[10000];
		int[] bs_a=new int[10000];
		String[] s=new String[2];
		int i=0;
		try{
			while(true){
				int n=Integer.parseInt(br.readLine());
				if(n==0) break;
				for(int j=0;j<n;j++){
					s=br.readLine().split(" ");
					ah=Integer.parseInt(s[0]);
					bh=Integer.parseInt(s[1]);
					if(ah>bh) as+=ah+bh;
					else if(ah<bh) bs+=ah+bh;
					else {as+=ah;bs+=bh;}
				}
				as_a[i]=as;bs_a[i++]=bs;
				as=0;bs=0;
			}
			System.out.println("");
			for(int j=0;j<i;j++){
				System.out.println(as_a[j]+" "+bs_a[j]);
			}
		}catch(Exception e){
			System.out.println("Error");
		}
	}
}