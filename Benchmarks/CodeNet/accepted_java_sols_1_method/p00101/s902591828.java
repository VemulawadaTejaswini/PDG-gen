import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner s=new Scanner (System.in);
		
		int n=s.nextInt();
		s.nextLine();
		for(int j=0;j<n;j++){
			char c[]=s.nextLine().toCharArray();
			for(int i=0;i<c.length-6;i++){
				if(c[i]=='H'&&c[i+1]=='o'&&c[i+2]=='s'&&c[i+3]=='h'&&c[i+4]=='i'&&c[i+5]=='n'&&c[i+6]=='o'){
					c[i+6]='a';
					i+=6;
				}
			}
			System.out.println(new String(c));
		}
	}
}