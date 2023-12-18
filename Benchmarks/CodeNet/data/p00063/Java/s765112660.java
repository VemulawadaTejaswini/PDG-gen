import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0,i,j;
		while(sc.hasNext()){
			String str=sc.next();
			char ch[]=str.toCharArray();
			for(i=0;i<ch.length/2;i++){
				if(ch[i]!=ch[ch.length-i-1]) break;
			}
			if(i==ch.length/2) count++;
		}
		System.out.println(count);
	}
}