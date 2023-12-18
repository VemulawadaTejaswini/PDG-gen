import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int ans = sc.nextInt()%39;
			System.out.printf("3C%02d\n",ans==0?39:ans);
		}
	}
}