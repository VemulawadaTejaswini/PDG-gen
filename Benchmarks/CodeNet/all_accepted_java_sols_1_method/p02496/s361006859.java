import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		boolean a[][]=new boolean[4][13];
		for(int i=0;i<4;i++){
			for(int j=0;j<13;j++) a[i][j]=false;
		}

		int n=stdIn.nextInt();
		while(n--!=0){
			String s=stdIn.next();
			int x=stdIn.nextInt();
			if(s.equals("S"))a[0][x-1]=true;
			else if(s.equals("H"))a[1][x-1]=true;
			else if(s.equals("C"))a[2][x-1]=true;
			else a[3][x-1]=true;
		}
			for(int i=0;i<4;i++){
				for(int j=0;j<13;j++){
					if(!a[i][j]){
						switch(i){
							case 0:
								System.out.println("S "+(j+1));
								break;
							case 1:
								System.out.println("H "+(j+1));
								break;
							case 2:
								System.out.println("C "+(j+1));
								break;
							case 3:
								System.out.println("D "+(j+1));
								break;
						}
					}
				}
			}
		
	}
}