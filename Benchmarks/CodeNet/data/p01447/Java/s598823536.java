public class Main{
	public static void main(String[] args){
		new Main().run();
	}
	public void run(){
		Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			int count = 0;
			int a = 0;
			while(n > 1){
				if(n <= 3){
					count++;
					break;
				}
				a = (int)(0.5 + ((double)n/3.0));
				n = Math.max(a,n-(2*a));
				count++;
			}
			System.out.println(count);
	}
}