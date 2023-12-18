import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Tape> tape = new ArrayList<Tape>();
		final int MAX_SECONDS = 7200;
		String buf;
		//"-1 -1 -1"が入力されるまでテープ情報をリストに追加する
		while(true){
			buf = br.readLine();
			String[] input = buf.split(" ");
			if(checkExit(input)){
				break;
			}
			else{
				tape.add(new Tape(MAX_SECONDS, getSeconds(input)));
			}
		}
		//テープごとの録画時間を出力する
		for(Tape t : tape){
			t.printRestSeconds();
			t.printRestSecondsInTripleMode();
		}
	}
	private static boolean checkExit(String[] str){
		int x = Integer.parseInt(str[0]);
		int y = Integer.parseInt(str[1]);
		int z = Integer.parseInt(str[2]);
		if(x == -1 && y == -1 && z == -1){
			return true;
		}
		else{
			return false;
		}
	}
	private static int getSeconds(String[] str){
		int h = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		int s = Integer.parseInt(str[2]);
		return h * 3600 + m * 60 + s;
	}
}

class Tape{
	private int maxRecordSeconds;
	private int recordSeconds;
	public Tape(int maxRecordSeconds, int recordSeconds){
		this.maxRecordSeconds = maxRecordSeconds;
		this.recordSeconds = recordSeconds;
	}
	public void printRestSeconds(){
		int s = this.maxRecordSeconds - this.recordSeconds;
		int h = s / 3600;
		s %= 3600;
		int m = s / 60;
		s %= 60;
		System.out.printf("%02d:%02d:%02d\n", h, m, s);
	}
	public void printRestSecondsInTripleMode(){
		int s = (this.maxRecordSeconds - this.recordSeconds) * 3;
		int h = s / 3600;
		s %= 3600;
		int m = s / 60;
		s %= m * 60;
		System.out.printf("%02d:%02d:%02d\n", h, m, s);
	}
}