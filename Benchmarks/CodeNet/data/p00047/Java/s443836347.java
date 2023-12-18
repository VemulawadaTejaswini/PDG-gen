import java.util.Scanner;


public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] atari = new boolean[3];
		atari[0] = true;
		while(sc.hasNext()){
			String change = sc.next();
			String[] changeArray = change.split(",");
			int a = henkan(changeArray[0]);
			int b = henkan(changeArray[1]);
			boolean c = false;
			c = atari[a];
			atari[a] = atari[b];
			atari[b] = c;
		}
		for(int i=0;i<3;i++){
			if(atari[i]){
				System.out.println(atari[i]);
				break;
			}
		}
	}
	public static int henkan(String a){
		if(a.equals("A")){
			return 0;
		}else if(a.equals("B")){
			return 1;
		}
		return 2;
	}
}