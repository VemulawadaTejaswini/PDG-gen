import java.util.Scanner;

public class Main {

	static String[] mark=new String[]{"S","H","C","D"};
	static boolean[][] card=new boolean[4][13];

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int count=Integer.parseInt(s.nextLine());
		for(int i=0;i<count;i++){
			String[] l=s.nextLine().split(" ");
			add(l[0],Integer.parseInt(l[1]));
		}

		ans();
	}

	private static void ans() {
		for(int i=0;i<4;i++){
			for(int k=0;k<13;k++){
				if(!card[i][k]){
					System.out.println(mark[i]+" "+(k+1));
				}
			}
		}
	}

	static void add(String m,int num){
		int index=0;
		for(int i=0;i<4;i++){
			if(m.equals(mark[i]))index=i;
		}
		card[index][num-1]=true;
	}
}