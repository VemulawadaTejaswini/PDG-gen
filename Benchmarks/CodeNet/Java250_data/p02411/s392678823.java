import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int m[]=new int[51],f[]=new int[51],r[]=new int[51],i,j,s;
		for(i=0;;i++){
			m[i]=stdIn.nextInt();
			f[i]=stdIn.nextInt();
			r[i]=stdIn.nextInt();
			if(m[i]==-1&&f[i]==-1&&r[i]==-1)break;
		}
		
		for(j=0;j<i;j++){
			s=m[j]+f[j];
			if(m[j]==-1||f[j]==-1)System.out.println("F");
			else if(s>=80)System.out.println("A");
			else if(s>=65)System.out.println("B");
			else if(s>=50)System.out.println("C");
			else if(s>=30&&r[j]>=50)System.out.println("C");
			else if(s>=30)System.out.println("D");
			else System.out.println("F");
		}
	}
}
