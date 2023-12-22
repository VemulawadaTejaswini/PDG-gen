import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String alf = "abcdefghijklmnopqrstuvwxyz";
		String salf[] = alf.split("");
		int array_t[] = new int[1000];
		int array_h[] = new int[1000];
		int score_t = 0;
		int score_h = 0;
		int i,m,t,h,k;
		int len;
		int time = scan.nextInt();
		for(i = 0; i < time; i++){
			int d = 0;
			int a = 0;
			int b = 0;
			String t_word = scan.next();
			String h_word = scan.next();
			String st_word[] = t_word.split("");
			String sh_word[] = h_word.split("");
			if(t_word.length() > h_word.length())
				len = h_word.length();
			else
				len = t_word.length();
			for(m = 0; m < len; m++){
				for(t = 0; t < alf.length(); t++){
					if(st_word[m].equals(salf[t])){
						array_t[a++] = t;
					}
				}
				for(h = 0; h < alf.length(); h++){
					if(sh_word[m].equals(salf[h])){
						array_h[b++] = h;
					}
				}
			}
				for(k = 0; k < len; k++){
					if(array_t[k] == array_h[k])
						++d;
					else if(array_t[k] > array_h[k]){
						score_t += 3;
						break;
					}
					else{
						score_h += 3;
						break;
					}
				}
				if(d == len){
					if(t_word.length() == h_word.length()){
						score_t++;
						score_h++;
					}
					else if(t_word.length() > h_word.length())
						score_t += 3;
					else
						score_h += 3;
			}
		}
		System.out.println(score_t+" "+score_h);
	}
}



		

	