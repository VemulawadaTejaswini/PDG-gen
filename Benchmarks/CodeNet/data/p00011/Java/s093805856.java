import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] num;
		String str;
		
		int tmp;
		int W = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int[] array = new int[W];

		NumAB[] pair = new NumAB[N];
		for(int i=0;i<W;i++){
			array[i]=i;
		}

		for(int i=0;i<N;i++){
			str = br.readLine();
			num = str.split(",",0);
			pair[i] = new NumAB(Integer.parseInt(num[0])-1,Integer.parseInt(num[1])-1);
		}
		for(int i=0;i<N;i++){
			tmp = array[pair[i].a];
			array[pair[i].a] = array[pair[i].b];
			array[pair[i].b] = tmp;
		}
		for(int i=0;i<W;i++){
			array[i]=array[i]+1;
			System.out.println(array[i]);
		}
	}
}

final class NumAB{
	int a,b;

	//?????????????????????
	NumAB(int x, int y){
		a=x;
		b=y;
	}
}