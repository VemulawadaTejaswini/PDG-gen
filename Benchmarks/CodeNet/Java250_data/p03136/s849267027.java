import java.util.Scanner;
public   class Main {
    
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int le[]=new int[n];
		int max_length=0;
		int max_number=-1;
		int sum=0;
		for (int i = 0; i < n; i++) {
			le[i]=sc.nextInt();
			sum+=le[i];
			if(le[i]>max_length) {
				max_length=le[i];
				max_number=i;
			}
		}
		sum-=max_length;
		System.out.println(sum>max_length?"Yes":"No");
		
	}
}