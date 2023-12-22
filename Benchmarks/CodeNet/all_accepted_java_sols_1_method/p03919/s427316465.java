import java.util.Scanner;

public class Main{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int h=sc.nextInt(); //縦
		int w=sc.nextInt(); //横
		
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				String str=sc.next();
				if(str.equals("snuke")){
					//数字をアルファベットに変換
					System.out.print((char)(j+'A'));
					System.out.println((i+1));
				}
			}
		}
	}
} 