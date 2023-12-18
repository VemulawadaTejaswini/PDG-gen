package Class01;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		int sum = 0;
		for(int i = 0; i < 5; i++){
			a[i] = sc.nextInt();
			if(a[i] < 40){
				a[i] = 40;
			}
		}
		for(int i = 0; i < 5; i++){
			sum =  sum + a[i];
		}
		
		
		System.out.println(sum/5);
	}

}