import java.util.Scanner;
public class Main {
	private static Scanner sc=new Scanner(System.in);
	private static int[][] index;
	private static int[] def=new int[6];
	public static void main(String[] args){
		for(int i=0;i<6;i++){
			def[i]=sc.nextInt();
		}
		String command=sc.next();
		index=new int[6][command.length()+1];
		for(int i=0;i<6;i++){
			index[i][0]=def[i];
		}
		for(int i=0;i<command.length();i++){
			move(command.charAt(i),i);
		}
		System.out.println(index[0][command.length()]);
	}
	private static void move (char c,int i){
		switch(c){
		case 'E':
			index[0][i+1]=index[3][i];
			index[2][i+1]=index[0][i];
			index[5][i+1]=index[2][i];
			index[3][i+1]=index[5][i];
			break;
		case 'W':
			index[0][i+1]=index[2][i];
			index[2][i+1]=index[5][i];
			index[5][i+1]=index[3][i];
			index[3][i+1]=index[0][i];
			break;
		case 'N':
			index[0][i+1]=index[1][i];
			index[4][i+1]=index[0][i];
			index[5][i+1]=index[4][i];
			index[1][i+1]=index[5][i];
			break;
		case 'S':
			index[0][i+1]=index[4][i];
			index[4][i+1]=index[5][i];
			index[5][i+1]=index[1][i];
			index[1][i+1]=index[0][i];
			break;
		}
	}
}