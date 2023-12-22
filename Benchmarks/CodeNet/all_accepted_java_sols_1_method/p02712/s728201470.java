public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum=0;
		int N = new java.util.Scanner(System.in).nextInt();
		for(int i =1;i<=N;i++){
			if(i%3!=0&&i%5!=0)sum+=i;
		
		}
				
		System.out.println(sum);

	}

	
	

}
