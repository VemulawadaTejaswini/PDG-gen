
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

	private static BufferedReader br;//Scannerは普段使わないからわからん
	
	public static void main(String[] args) throws Exception {
		br = new BufferedReader(new InputStreamReader(System.in));
		
		for(;;){
			int judge = nextInt();
			if(judge==0) break;
			//採点を読み取る
			int data[] = new int[judge];
			int indexOfMax=0, indexOfMin=0;
			for(int i=0; i<judge; i++){
				data[i] = nextInt();
				if(data[i] > data[indexOfMax]) indexOfMax = i;
				if(data[i] < data[indexOfMin]) indexOfMin = i;
			}
			//合計を計算
			int total = 0;
			for(int i=0; i<judge; i++){
				if(i==indexOfMax || i==indexOfMin) continue;
				total += data[i];
			}
			//平均を表示 キャストすれば切り捨てられるはず
			System.out.println((int)(total/(judge-2)));
		}
		
		br.close();
	}
	
	//入力 意外と１行だった
	private static int nextInt() throws Exception{
		return Integer.parseInt(br.readLine());
	}

}

