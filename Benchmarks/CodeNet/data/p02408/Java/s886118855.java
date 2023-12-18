import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int su;
		int num=0;
		String mark;
		Boolean s[]=new Boolean[n*4-1];
		Arrays.fill(s, false);//s[]の配列に初期値falseを設定
		
		for(int i=0;i<n;i++){
			mark=sc.next();
			su=sc.nextInt();
			switch (mark){
				case "S":num=0;break;
				case "H":num=13;break;
				case "C":num=26;break;
				case "D":num=39;break;
			}
			s[num+su-1]=true;
		}//for
		
		
		for(int i=0;i<51;i++){
			if(i<13 && s[i]==false){
				System.out.println("S "+(i+1)); 
			}else if(i<26 && s[i]==false){
				System.out.println("H "+(i-12)); 
			}else if(i<39 && s[i]==false){
				System.out.println("C "+(i-25)); 
			}else if(i<52 && s[i]==false){
				System.out.println("D "+(i-38)); 
			}else continue;
		}//for
	}
}