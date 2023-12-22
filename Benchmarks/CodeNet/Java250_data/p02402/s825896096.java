import java.util.Scanner;
class Main {
	public void kami() {
		Scanner sc = new Scanner(System.in);
		long gou = 0;
		int min = 1000000;
		int max = -1000000;
		int n = sc.nextInt();
		if(n == 0){
			min = 0;
			max = 0;
		}else {
			for(int i = 1; i <= n; i++){
				int ai = sc.nextInt();
				gou = ai + gou;
				
				if(n == 1){
					min = ai;
					max = ai;
				}
				
				if(ai < min){
					min = ai;
				}else if(ai > max){
					max = ai;
				}
			}
		}
		
		System.out.println(min + " " + max + " " + gou);
	}

    public static void main(String[] args) {
		new Main().kami();
	}

}