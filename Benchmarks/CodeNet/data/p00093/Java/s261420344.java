import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int cnt = 0;
			if((a & b) == 0) break;
			for(int i = a; i <= b; i++){
				if(i % 4 == 0 || i % 400 == 0){
					System.out.println(i);
					cnt++;
				}else{
					continue;
				}
			}
			if(cnt == 0) System.out.println("NA");
			System.out.println();
		}

	}
}