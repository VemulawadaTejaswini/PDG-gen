import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int[] pasta = new int[3];
		int[] juice = new int[2];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<pasta.length; i++) pasta[i]=sc.nextInt();
		for(int i=0; i<juice.length; i++) juice[i]=sc.nextInt();
		
		int min=pasta[0]+juice[0]-50;
		for(int i=0; i<pasta.length; i++){
			for(int j=0; j<juice.length; j++){
				if(min>pasta[i]+juice[j]-50)
					min=pasta[i]+juice[j]-50;
			}
		}
		System.out.println(min);
	}
}