import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args){
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		String ab = null;
		int abNum[] = null;
		String[] abString = null;
		try {
			ab = br.readLine();
			abString = ab.split(" ");
			abNum = new int[abString.length];
			for(int i=0 ; i < abNum.length ;i++){
				abNum[i] = Integer.parseInt(abString[i]);
			}
		} catch (IOException e) {

		}
		int koyaku = koyaku(abNum);
		int kobai = kobai(abNum);
		System.out.println(koyaku + " " + kobai);
	}
	//最大公約数
	public static int koyaku(int[] Num){
		int koyaku = 1;
		if(Num[0] == Num[1]){
			return Num[0];
		}
		int dai = Num[0];

		if(dai < Num[1]){
			dai = Num[1];
		}
		while(0 < dai){
			if(Num[0] % dai == 0 && Num[1] % dai == 0){
				koyaku = dai;
				break;
			}
			dai--;
		}
		return koyaku;
	}
	//最小公倍数
	public static int kobai(int[] Num){
		int kobai = 0;
		if(Num[0] == Num[1]){
			return Num[0];
		}
		int dai = Num[0];
		int syo = Num[1];

		if(dai < Num[1]){
			dai = Num[1];
			syo = Num[0];
		}
		while(dai < 2000000000){
			kobai += dai;
			if(kobai % syo == 0){
				break;
			}
		}
		return kobai;
	}
}