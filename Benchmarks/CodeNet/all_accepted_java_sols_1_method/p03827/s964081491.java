import java.util.*;
//Increment Decrement
public class Main {
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int N=Integer.parseInt(scn.nextLine());
		String S=scn.nextLine();
		int x=0;
		int max=0;
		scn.close();
		
		for(int i=0;i<N;i++){
			switch(S.charAt(i)){
			case 'I':
				x++;
				if(x>max){
					max=x;
				}
				break;
			case 'D':
				x--;
				break;
			}
		}
		System.out.println(max);
	}
}
