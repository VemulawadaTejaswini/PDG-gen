
import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);


		int T=scanner.nextInt();

		for(int i=0;i<T;i++){

			Tank tank=new Tank();

			int H=scanner.nextInt();
			int W=scanner.nextInt();
			tank.H=H;
			tank.W=W;//マップの最大値をTankクラスに引き渡す

			
			//マップを作ると同時に戦車の向きと現在地をTankクラスに渡す
			
			for(int p=0;p<H;p++){
				
				String st=scanner.next();

				for(int k=0;k<W;k++){

					tank.map[p][k]=st.charAt(k);
					

					switch(tank.map[p][k]){
					case '^':
						tank.positionH=p;
						tank.positionW=k;
						tank.direction='^';
						break;

					case 'v':
						tank.positionH=p;
						tank.positionW=k;
						tank.direction='v';
						break;

					case '<':
						tank.positionH=p;
						tank.positionW=k;
						tank.direction='<';
						break;

					case '>':
						tank.positionH=p;
						tank.positionW=k;
						tank.direction='>';
						break;
					}

				}

			}



			int N=scanner.nextInt();

			String order=scanner.next();

			//各命令をtankクラスのメソッドに渡す
			for(int k=0;k<N;k++){
				switch(order.charAt(k)){
				case'U':
					tank.Up();
					break;

				case'D':
					tank.Down();
					break;

				case'L':
					tank.Left();
					break;

				case'R':
					tank.Right();
					break;

				case'S':
					tank.Shot();
					break;

				}

			}

			for(int k=0;k<tank.H;k++){
				for(int q=0;q<tank.W;q++){
					System.out.print(String.valueOf(tank.map[k][q]));
				}
				System.out.println("");
			}
			if(!(i==(T-1))){
				System.out.println("");
			}
			
		}
	}

}



class Tank{


	int H=0;//マップの大きさ
	int W=0;

	int positionH=0;//戦車の現在地
	int positionW=0;
	char direction='0';//戦車の向き
	char map[][];//マップ
	
	Tank(){map=new char[20][20];}

	

//戦車の移動したい場所を判別して処理をする
	public void Up(){



		if((positionH>0)&&(map[positionH-1][positionW]=='.')){

			map[positionH][positionW]='.';
			map[positionH-1][positionW]='^';
			positionH=positionH-1;
			direction='^';
		}

		map[positionH][positionW]='^';
		direction='^';

	}


	public void Down(){


		if((positionH<H-1)&&(map[positionH+1][positionW]=='.')){

			map[positionH][positionW]='.';
			map[positionH+1][positionW]='v';
			positionH=positionH+1;
			direction='v';

		}

		map[positionH][positionW]='v';
		direction='v';
	}


	public void Left(){

		if((positionW>0)&&(map[positionH][positionW-1]=='.')){

			map[positionH][positionW]='.';
			map[positionH][positionW-1]='<';
			positionW=positionW-1;
			direction='<';

		}

		map[positionH][positionW]='<';
		direction='<';
	}


	public void Right(){

		if((positionW<W-1)&&(map[positionH][positionW+1]=='.')){

			map[positionH][positionW]='.';
			map[positionH][positionW+1]='>';
			positionW=positionW+1;
			direction='>';

		}
		map[positionH][positionW]='>';
		direction='>';
	}


	//戦車の向きと砲弾のぶつかる先を処理、壁でなければ砲弾を移動させてループする

	public void Shot(){
		int shot=0;
		switch(direction){

		case '^':
			shot=positionH;

			while(true){

				if(shot==0){
					break;
				}
				else if((map[shot-1][positionW]=='.')||(map[shot-1][positionW]=='-')){

					shot=shot-1;

				}

				else if(map[shot-1][positionW]=='#'){
					break;
				}
				else if(map[shot-1][positionW]=='*'){
					map[shot-1][positionW]='.';
					break;
				}
			}
			break;


		case 'v':
			shot=positionH;


			while(true){

				if(shot==H-1){
					break;
				}
				else if((map[shot+1][positionW]=='.')||(map[shot+1][positionW]=='-')){

					shot=shot+1;

				}

				else if(map[shot+1][positionW]=='#'){
					break;
				}
				else if(map[shot+1][positionW]=='*'){
					map[shot+1][positionW]='.';
					break;
				}
			}
			break;

		case '<':
			shot=positionW;


			while(true){

				if(shot==0){
					break;
				}
				else if((map[positionH][shot-1]=='.')||(map[positionH][shot-1]=='-')){

					shot=shot-1;

				}

				else if(map[positionH][shot-1]=='#'){
					break;
				}
				else if(map[positionH][shot-1]=='*'){
					map[positionH][shot-1]='.';
					break;
				}
			}
			break;


		case '>':
			shot=positionW;


			while(true){

				if(shot==W-1){
					break;
				}
				else if((map[positionH][shot+1]=='.')||(map[positionH][shot+1]=='-')){

					shot=shot+1;

				}

				else if(map[positionH][shot+1]=='#'){
					break;
				}
				else if(map[positionH][shot+1]=='*'){
					map[positionH][shot+1]='.';
					break;
				}
			}
			break;
		}

	}
}

