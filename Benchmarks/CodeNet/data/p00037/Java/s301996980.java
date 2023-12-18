import java.util.*;



class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		while(sc.hasNext()){
			char[][] UD=new char[5][4];
			char[][] LR=new char[4][5];

			for(int i=0;i<4;i++){
				UD[i]=sc.next().toCharArray();
				LR[i]=sc.next().toCharArray();
			}
			UD[4]=sc.next().toCharArray();

			char[][][] root=new char[5][5][4];

			for(int i=0;i<5;i++){
				for(int j=0;j<4;j++)
					root[i][j][0]=UD[i][j];
				root[i][4][0]='0';

				if(i==0){
					for(int j=0;j<5;j++)
						root[i][j][1]='0';
				}else{
					for(int j=0;j<5;j++)
						root[i][j][1]=LR[i-1][j];
				}
				root[i][0][2]='0';
				for(int j=1;j<5;j++)
					root[i][j][2]=UD[i][j-1];

				if(i==4){
					for(int j=0;j<5;j++)
						root[i][j][3]='0';
				}else{
					for(int j=0;j<5;j++)
						root[i][j][3]=LR[i][j];
				}
			}

			int px=0,py=0;
			int rotate=0;//0 1 2 3
			do{
				for(int i=4-1;i>=0;i--){
					int r=(rotate+i+2)%4;
					if(root[py][px][r]=='1'){
						rotate=r;
						switch(r){
						case 0:pr("R");px++;break;
						case 1:pr("U");py--;break;
						case 2:pr("L");px--;break;
						case 3:pr("D");py++;break;
						}
						break;
					}
				}
			}while(!(px==0 && py==0));
			ln();
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}