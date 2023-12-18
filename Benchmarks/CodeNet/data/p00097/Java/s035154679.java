import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tes = null;

		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();

		try {
			tes = br.readLine();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		int a,b;
		int[] r = {0,0};
		String[] fruit = tes.split(" ", 0);
		a = Integer.parseInt(fruit[0]);
		al.add(a);
		b = Integer.parseInt(fruit[1]);
		al2.add(b);
		if(a == 0 && b == 0){
			return;
		}
		while(true){
			try {
				tes = br.readLine();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			if(tes == null){
				break;
			}

			try{
				fruit = tes.split(" ", 0);
				a = Integer.parseInt(fruit[0]);
				b = Integer.parseInt(fruit[1]);
				if(a == 0 && b == 0){
					break;
				}
				fruit = tes.split(" ", 0);
				al.add(a);
				al2.add(b);
				
			}catch(NumberFormatException e){
				break;
			}
		}

		int[] total = new int[1];
		
		for(int i=0;i<al.size();i++){
			total[0] = 0;
			if(al.get(i) == 9 && al2.get(i) > 864){
				System.out.println("0");
			}else if(al.get(i) == 8 && al2.get(i) > 774){
				System.out.println("0");
			}else if(al.get(i) == 7 && al2.get(i) > 679){
				System.out.println("0");
			}else if(al.get(i) == 6 && al2.get(i) > 585){
				System.out.println("0");
			}else if(al.get(i) == 5 && al2.get(i) > 490){
				System.out.println("0");
			}else if(al.get(i) == 4 && al2.get(i) > 394){
				System.out.println("0");
			}else if(al.get(i) == 3 && al2.get(i) > 297){
				System.out.println("0");
			}else if(al.get(i) == 2 && al2.get(i) > 199){
				System.out.println("0");
			}else if(al.get(i) == 1 && al2.get(i) > 100){
				System.out.println("0");
			}

			saiki(total,0,al.get(i)-1,al2.get(i),0);
			System.out.println(total[0]);
		}


	}
	public static void saiki(int[] total,int tmpgo,int kaisuu,int mokuhyou,int genkai){
		if(mokuhyou <= tmpgo){
			return;
		}
		if(kaisuu == 0){
			for(int i=genkai;i<=100;i++){
				if(mokuhyou == (tmpgo+i)){
					total[0]++;
				}else if(mokuhyou <= (tmpgo+i)){
					return;
				}
			}
			return;
		}
		
		for(int i=genkai;i<100;i++){
			saiki(total,tmpgo+i,kaisuu-1,mokuhyou,i+1);
		}
	}
}