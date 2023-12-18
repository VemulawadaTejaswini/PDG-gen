import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String alf = "abcdefghijklmnopqrstuvwxyz";
		String salf[] = alf.split("");
 		int time = scan.nextInt();
		int i,m,r,q;
		int score_t = 0;
		int score_h = 0;
		for(i = 0; i < time; i++){
			int num_t = 0;
			int num_h = 0;
			int ten_t = 1;
			int ten_h = 1;
			String word_t = scan.next();
			String word_h = scan.next();
			String sword_t[] = word_t.split("");
			String sword_h[] = word_h.split("");
			int b = 0;
			for(r = 0; r < alf.length(); r++){
				for(m = 0; m < word_t.length(); m++){
					if(salf[r].equals(sword_t[m])){
						for(q = 1; q <= m; q++)
							ten_t *= 10;
						num_t += ten_t * r;
					}
			}
				for(m = 0; m < word_h.length(); m++){
					if(salf[r].equals(sword_h[m])){
						for(q = 1; q <= m; q++)
							ten_h *= 10;
						num_h += ten_h * r;
					}
				}
			}
					if(num_t < num_h)
						score_t += 3;
					else if(num_t == num_h){
						score_t++;
						score_h++;
					}
					else
						score_h += 3;
			}
		System.out.println(score_t+" "+score_h);
	}
}


		

	