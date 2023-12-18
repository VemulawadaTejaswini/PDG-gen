import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		char[] chr = s.toCharArray();
		int ans = 0, count = 1;
		for(int i = 0; i < n - 1; i++){
			if(chr[i] != chr[i+1]){
				count++;
			}
		}
		System.out.println(count);
	}

	}