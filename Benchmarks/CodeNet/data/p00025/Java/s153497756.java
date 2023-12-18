import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			String as = sc.nextLine();
			String bs = sc.nextLine();
			String[] a = as.split(" ");
			String[] b = bs.split(" ");
			int hit = 0, bullow = 0;
			for(int i = 0; i < a.length; i++){
				for(int j = 0; j < b.length; j++){
					if(a[j] == b[j]){
						hit++;
					}else if(a[i] == b[j] || a[j] == b[i]){
						bullow++;
					}
				}
			}
			System.out.println(hit + " " + bullow);
		}
	}
}