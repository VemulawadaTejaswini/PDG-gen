import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hisi = 0;
		int chou = 0;
		while(sc.hasNext()){
			String str = sc.nextLine();
			String[] ary = str.split(",");
			int x = Integer.parseInt(ary[0]);
			int y = Integer.parseInt(ary[1]);
			int d = Integer.parseInt(ary[2]);
			if(Math.pow(d,2) == Math.pow(x,2)+Math.pow(y,2)){
				chou++;
			}else if(x == y ){
				hisi++;
			}
			System.out.println(chou);
			System.out.println(hisi);
		}
		
		
		sc.close();
	}

}