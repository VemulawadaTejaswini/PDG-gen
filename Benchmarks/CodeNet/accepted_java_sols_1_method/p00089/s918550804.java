import java.util.Scanner;

public class Main{
	Main(){
		Scanner sc = new Scanner(System.in);
		String[][] str = new String[101][];
		int[][] a = new int[101][];
		int p=0, maxl=0, l, q=0;
		
		while(sc.hasNext()){
			str[p] = (sc.nextLine()).split(",");
			l = str[p].length;
			a[p] = new int[l+1];
			for(int i = 0; i < l; i++){
				a[p][i] = Integer.parseInt(str[p][i]);
			}
			if(l > maxl){
				q = p;
				maxl = l;
			}
			p++;
		}
		
		for(int i = 1; i <= q; i++){
			for(int j = 0; j < a[i].length-1; j++){
				if(j-1 < 0){
					a[i][j] += a[i-1][j];
				} else if(j == a[i].length-2){
					a[i][j] += a[i-1][j-1];
				} else {
					if(a[i-1][j] > a[i-1][j-1]){
						a[i][j] += a[i-1][j];
					} else {
						a[i][j] += a[i-1][j-1];
					}
				}
			}
		}
		
		for(int i = q; i < p-1; i++){
			for(int j = 0; j < a[i].length-1; j++){
				if(a[i][j] < a[i][j+1]){
					a[i+1][j] += a[i][j+1];
				} else {
					a[i+1][j] += a[i][j];
				}
			}
		}
		
		System.out.println(Integer.toString(a[p-1][0]));
	}
	
	public static void main(String[] args){
		new Main();
	}
}