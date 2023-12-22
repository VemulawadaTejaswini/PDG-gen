import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		final int H=sc.nextInt(),W=sc.nextInt();
		sc.nextLine();
		final String[][] s=new String[H+2][W+2];
		boolean f=true;
		for(int i=0;i<W+2;i++){
			s[0][i]=".";
			s[H+1][i]=".";
		}
		for(int i=1;i<H+1;i++){
			s[i]=("."+sc.nextLine()+".").split("");
		}
		/*		
		for(int i=0;i<H+2;i++){
			for(int k=0;k<W+2;k++){
				System.out.print(s[i][k]);
			}
			System.out.println("");
		}
		*/
		
		for(int i=1;i<H+1;i++){
			for(int k=1;k<W+1;k++){
				if(s[i][k].equals("#")){
					if(s[i-1][k].equals("#"))continue;
					if(s[i+1][k].equals("#"))continue;
					if(s[i][k-1].equals("#"))continue;
					if(s[i][k+1].equals("#"))continue;
					f=false;
					break;
				}
			}
			if(! f)break;
		}
		
		String ans;
		if(f){
			ans="Yes";
		}else{
			ans="No";
		}
		System.out.println(ans);
	}
}
