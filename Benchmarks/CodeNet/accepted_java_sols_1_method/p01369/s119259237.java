import java.util.Scanner;

//A: koukyoukoukokukikou
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String r = "yuiophjklnm";
		while(true){
			String s = sc.next();
			if(s.equals("#"))break;
			int c = 0;
			int m = -1;
			for(char t : s.toCharArray()){
				boolean right = false;
				for(int i=0;i<r.length();i++)if(t==r.charAt(i))right=true;
				if(right){
					if(m==-1)m=0;
					else if(m==1){
						m=0;
						c++;
					}
				}
				else{
					if(m==-1)m=1;
					else if(m==0){
						m=1;
						c++;
					}
				}
			}
			System.out.println(c);
		}
	}
}