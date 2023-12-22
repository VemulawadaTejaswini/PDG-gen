import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		boolean s[] = new boolean[100];

		for(int n=0;n<num;n++){
			s[n] = false;
		}
		int count = 0;
		for(int n=0;n<num;n++){
			int k = sc.nextInt();
			if(s[k-1] == false){
				s[k-1] = true;
				count++;
			}
		}

		System.out.println(count);
	}
}