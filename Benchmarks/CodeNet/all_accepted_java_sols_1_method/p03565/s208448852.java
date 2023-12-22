import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner stdIn=new Scanner(System.in);
		String S=stdIn.next();
		String T=stdIn.next();
		char s[]=new char[S.length()];
		char t[]=new char[T.length()];
		char u[]=new char[S.length()];
		int slen=S.length(),tlen=T.length();
		int z=slen,y=0,x=0,v=slen-1,fin=0;
		while(z>0){
			s[y]=S.charAt(z-1);
			y++;
			z--;
		}z=tlen;y=0;
		while(z>0){
			t[y]=T.charAt(z-1);
			y++;
			z--;
		}z=0;y=0;
		while(z<(slen-tlen)+1){
			while(y<tlen){
				if(s[z+y]!='?'&&s[z+y]!=t[y]){
					fin=1;
					break;
				}
				else
					y++;
			}
			if(fin==0){
				fin=2;
				break;
			}
			fin=0;
			y=0;
			z++;
		}y=0;
		if(fin==2){
			while(x<slen){
				if(x==z)
					while(y<tlen){
						u[v]=t[y];
						y++;v--;x++;
					}
				else{
					if(s[x]=='?')
						u[v]='a';
					else
						u[v]=s[x];
					x++;v--;
				}
			}z=0;
			while(z<slen){
				System.out.print(u[z]);
				z++;
			}
		}
		else
			System.out.println("UNRESTORABLE");
	}
}
