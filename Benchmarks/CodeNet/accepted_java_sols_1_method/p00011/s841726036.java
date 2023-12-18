import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc=new Scanner(System.in)){
			int w=sc.nextInt();
			int h=sc.nextInt();
			int[] game=new int[w];
			for(int i=0;i<game.length;i++){
				game[i]=i+1;
			}
			for(int j=0;j<h;j++){
			String line=sc.next();
			String[] ab=line.split(",");
			int a=Integer.parseInt(ab[0])-1;
			int b=Integer.parseInt(ab[1])-1;
			int tran=0;
			tran=game[a];
			game[a]=game[b];
			game[b]=tran;
			}
			for(int i1=0;i1<game.length;i1++){
				System.out.println(game[i1]);
			}
		}
		
	}

}
