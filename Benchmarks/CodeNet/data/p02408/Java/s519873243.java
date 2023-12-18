import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;



public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc =null;
		String str;
		int[][] tp=new int[5][14];
		int x=Integer.parseInt(br.readLine());
		for(;(str=br.readLine())!=null;){
			sc=new Scanner(str);
			String type=sc.next();
			int m=sc.nextInt();
			switch(type){
			case "S":{tp[1][m]=1;break;}
			case "H":{tp[2][m]=1;break;}
			case "C":{tp[3][m]=1;break;}
			case "D":{tp[4][m]=1;break;}
			}
		}
		for(int i=1;i<5;i++){
			for(int l=1;l<14;l++){
				if(tp[i][l]==0){
					switch(i){
					case 1:{System.out.println("S "+l);break;}
					case 2:{System.out.println("H "+l);break;}
					case 3:{System.out.println("C "+l);break;}
					case 4:{System.out.println("D "+l);break;}
					}
				}
			}
		}System.out.println();
		}		
	}