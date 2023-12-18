import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int N = sc.nextInt();
		int spot[][] =new int[N][2];
		
		for(int i=0; i<N; i++){
			for(int j=0; j<2; j++){
				spot[i][j]=sc.nextInt();
			}
		}
		
		
		int counter = 0;
		int where[]={spot[0][0],spot[0][1]};  //x,y
		
		
		for(int i=0; i<N; ){ //どこへ行くか  AAA
				if(where[0]==spot[i][0] && where[1]!=spot[i][1]){ //x座標は同じ時
					if(where[1]>spot[i][1])   //目的地のy座標が1つ下なら
						where[1]--;
					else
						where[1]++;
				}
				else if(where[0]!=spot[i][0] && where[1]==spot[i][1]){ //y座標は同じ時
					if(where[0]>spot[i][1])   //目的地のx座標が下なら
						where[0]--;
					else
						where[1]++;
				}
				else if(where[0]==spot[i][0] && where[1]!=spot[i][1]){ //目的地に来た時
					i++; //次の目的地へ
				}
				else //xもyも違う時
					if(where[0]<spot[i][0] && where[1]<spot[i][1]){
						where[0]++;
						where[1]++;
					}
					else if(where[0]>spot[i][0] && where[1]>spot[i][1]){
						where[0]--;
						where[1]--;
					}
				
				counter++;
				
		}  //AAA
		
		System.out.println(counter);
		
	}

}