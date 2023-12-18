import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		for(int i=0;i<a;i++){
			String str=s.next();
			boolean A=true;
			boolean B=true;
			if(str.charAt(0)!='>')A=B=false;
			if(str.length()<6||str.length()%2==1)A=B=false;
			if(str.length()>=6&&str.length()%2==0){
				if(str.charAt(1)!='\'')A=false;
				if(str.charAt(1)!='^')B=false;
				if(str.charAt(str.length()-1)!='~')A=B=false;
				if(str.charAt(str.length()-2)!='~')B=false;
				if(A){
					String [] dat=str.split("#");
					if(dat.length!=2)A=false;
					if(A){
						if(dat[0].length()==dat[1].length()+1||dat[0].length()>2){
							for(int j=0;j<dat[1].length()-1;j++){
								if(dat[0].charAt(2+j)!='='||dat[1].charAt(j)!='=')A=false;
							}
						}else A=false;
					}
				}
				if(B){
					for(int j=2;j<str.length()-2;j+=2){
						if(str.charAt(j)!='Q'||str.charAt(j+1)!='=')B=false;
					}
				}
			}
			if(A)System.out.println("A");
			else if(B)System.out.println("B");
			else System.out.println("NA");
		}
	}
}