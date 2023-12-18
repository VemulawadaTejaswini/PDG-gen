import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		while(true){
			int x = n.nextInt();
			if(x==0)break;
			int sum=0;
			while(x>0){
				sum+=x%10;
				x/=10;
			}
			System.out.println(sum);
		}
	}
}