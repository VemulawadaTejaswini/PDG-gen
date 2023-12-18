import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] s = sc.next().split("");
		int prt=0;
		for(int i=0;i<s.length;i++){
			int cnt=0;
			for(int j=0;j<s.length-i;j++){
				boolean t = false;
				switch(s[i+j]){
				case "A":
					cnt++;
					break;
				case "T":
					cnt++;
					break;
				case "C":
					cnt++;
					break;
				case "G":
					cnt++;
					break;
				default:
					t=true;
					break;
				}
				if(t)break;
			}
			if(cnt>prt)prt=cnt;
		}
		System.out.print(prt);
	}
}