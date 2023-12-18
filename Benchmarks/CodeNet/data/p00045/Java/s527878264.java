import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String s;
		String[] t;
		int summoney,sumcount;
		int number;
		summoney=0;
		sumcount=0;
		number=0;
		int[] n=new int[2];
		while(in.hasNext()){
			s=in.nextLine();
			t=s.split(",");
			for(int i=0;i<t.length;i++){
				n[i]=Integer.parseInt(t[i]);
			}
			summoney+=n[0]*n[1];
			sumcount+=n[1];
			number++;
		}
		System.out.println(summoney+" "+(int)(Math.ceil((double)sumcount/number)));
	}
}