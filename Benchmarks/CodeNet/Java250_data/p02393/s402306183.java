import java.util.Scanner;
public class Main {
	void sort(){
		int a[] = new int[3];
		int tmp;
		Scanner s = new Scanner(System.in);
		for(int i = 0;i < 3;i++){
			a[i] = s.nextInt();
			for(int j = 0;j < i;j++){
				if(a[j] > a[i]){
					tmp = a[j];
					a[j] = a[i];
					a[i] = tmp;
				}
			}
		}
		System.out.println(a[0] + " " + a[1] + " " + a[2]);
	}
	public static void main(String args[]){
		Main m = new Main();
		m.sort();
	}
}