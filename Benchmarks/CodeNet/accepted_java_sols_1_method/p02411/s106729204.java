import java.util.*;

class Main {
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		char[]  score = {'A','B','C','D','F'};
		while(true){
			int m = Integer.parseInt(in.next());
			int f = Integer.parseInt(in.next());
			int r = Integer.parseInt(in.next());
			if(m==-1 && f==-1 && r==-1)
				break;
			else if(m==-1 || f==-1)
				System.out.println(score[4]);
			else if(m+f >= 80)
				System.out.println(score[0]);
			else if(m+f <80 && m+f>=65)
				System.out.println(score[1]);
			else if(m+f <65 && m+f>=50)
				System.out.println(score[2]);
			else if(m+f <50 && m+f>=30){
				if(r >=50) System.out.println(score[2]);
				else System.out.println(score[3]);
			}
			else if(m+f<30)
				System.out.println(score[4]);	
		}
	}	
}