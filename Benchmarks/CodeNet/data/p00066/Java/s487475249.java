import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		while(s.hasNext()){
			String takeshi=s.next();
			char[][] c=new char[3][3];
			for(int i=0;i<3;i++)
				for(int j=0;j<3;j++)
					c[i][j]=takeshi.charAt(i*3+j);
			
			if(c[0][0]=='o'&&c[0][1]=='o'&&c[0][2]=='o')System.out.println("o");
			else if(c[0][0]=='x'&&c[0][1]=='x'&&c[0][2]=='x')System.out.println("x");
			else if(c[1][0]=='o'&&c[1][1]=='o'&&c[1][2]=='o')System.out.println("o");
			else if(c[1][0]=='x'&&c[1][1]=='x'&&c[1][2]=='x')System.out.println("x");
			else if(c[2][0]=='o'&&c[2][1]=='o'&&c[2][2]=='o')System.out.println("o");
			else if(c[1][0]=='x'&&c[1][1]=='x'&&c[1][2]=='x')System.out.println("x");
			else if(c[0][0]=='o'&&c[1][0]=='o'&&c[2][0]=='o')System.out.println("o");
			else if(c[0][0]=='x'&&c[1][0]=='x'&&c[2][0]=='x')System.out.println("x");
			else if(c[0][1]=='o'&&c[1][1]=='o'&&c[2][1]=='o')System.out.println("o");
			else if(c[0][1]=='x'&&c[1][1]=='x'&&c[2][1]=='x')System.out.println("x");
			else if(c[0][2]=='o'&&c[1][2]=='o'&&c[2][2]=='o')System.out.println("o");
			else if(c[0][2]=='x'&&c[1][2]=='x'&&c[2][2]=='x')System.out.println("x");
			else if(c[0][0]=='o'&&c[1][1]=='o'&&c[2][2]=='o')System.out.println("o");
			else if(c[0][0]=='x'&&c[1][1]=='x'&&c[2][2]=='x')System.out.println("x");
			else if(c[0][2]=='o'&&c[1][1]=='o'&&c[2][0]=='o')System.out.println("o");
			else if(c[0][2]=='x'&&c[1][1]=='x'&&c[2][0]=='x')System.out.println("x");
			else System.out.println("d");
		}
	}
}