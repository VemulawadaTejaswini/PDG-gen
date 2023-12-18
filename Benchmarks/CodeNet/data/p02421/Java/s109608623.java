import java.io.IOException;
import java.util.Scanner;
public class Main {
	private static int tP = 0; // 太郎のポイント
	private static int hP = 0; // 花子のポイント
	private static char alpha[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
			'o','p','q','r','s','t','u','v','w','x','y','z'};

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		for(int i=0;i<x;i++) {
			String t = sc.next();
			String h = sc.next();
			char[] tc = t.toCharArray();
			char[] hc = h.toCharArray();
			int tmpt = 0;
			int tmph = 0;
			for(int j=0;j<alpha.length;j++) {
				if(alpha[j] == tc[0]) {
					tmpt = j;
				}
				if(alpha[j] == hc[0]) {
					tmph = j;
				}
			}
			if(tmpt > tmph) {
				tP += 3;
			}else if(tmpt < tmph) {
				hP += 3;
			}else if(tmpt == tmph) {
				tP += 1;
				hP += 1;
			}
		}

		System.out.println(tP + " " + hP);

		sc.close();
	}
}
