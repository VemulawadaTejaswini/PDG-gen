import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String x = new String();
		while(scan.hasNext()){
			String buf = scan.nextLine();
			x = x + buf;
		}
		String lx = x.toLowerCase();
		int[] b;
		b = new int[100];
		String xl[] = lx.split("");
		String al = "abcdefghijklmnopqrstuvwxyz";
		String alf[] = al.split("");
		int i,m;
		for(i = 0; i < x.length(); i++){
			for(m = 0; m < 26; m++){
				if(xl[i].equals(alf[m]))
					b[m]++;
			}
		}
		for(i = 0; i < 26; i++){
			System.out.println(alf[i]+" : "+b[i]);
		}
		
	}
}