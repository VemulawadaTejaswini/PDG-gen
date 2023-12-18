import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		//File fi=new File("file.txt");

		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		 String type;
		 int b,f,r,v;
		 int[][][] tp=new int[5][4][11];
		for(int i=0;i<t;i++){
			b=sc.nextInt();
			f=sc.nextInt();
			r=sc.nextInt();
			v=sc.nextInt();
			tp[b][f][r]+=v;
			int x=tp[b][f][r];
			if(x<0)x=0;
			else if(x>10)x=9;
			tp[b][f][r]=x;
			}sc.close();
		for(int i=1;i<5;i++){
			for(int l = 1;l<4;l++){
				for(int m=1;m<11;m++){
					System.out.print(" "+tp[i][l][m]);
				}System.out.println();				
				}if(i!=4)System.out.println("####################");
			}
		}
		
		
	}