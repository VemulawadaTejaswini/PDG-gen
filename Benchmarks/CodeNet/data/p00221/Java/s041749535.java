import java.util.Scanner;

public class Main{
	Main(){
		Scanner sc = new Scanner(System.in);
		String a[] = new String[10001];
		
		for(int i = 0; i < 10000; i++){
			int t = i + 1;
			if(t % 5 == 0){
				if(t % 3 == 0){
					a[i] = "FizzBuzz";
				} else {
					a[i] = "Buzz";
				}
			} else if(t % 3 == 0){
				a[i] = "Fizz";
			} else {
				a[i] = Integer.toString(t);
			}
		}
		
		while(true){
			int m = sc.nextInt();
			int n = sc.nextInt();
			if(m == 0 && n == 0){
				break;
			}
			
			int mem[] = new int[m+1];
			for(int i = 1; i < m; i++){
				mem[i] = i+1;
			}
			mem[m] = 1;
			int p = 1;
			for(int i = 0; i < n; i++){
				String str = sc.next();
				if(!str.equals(a[i])){
					if(p-1 == 0){
						mem[m] = mem[1];
						mem[1] = -1;
					} else {
						mem[p-1] = mem[p];
						mem[p] = -1;
					}
					p = mem[p-1];
				} else {
					p = mem[p];
				}
			}
			
			for(p = 1; p <= m; p++){
				if(mem[p] != -1){
					System.out.print(Integer.toString(p));
					break;
				}
			}
			for(p += 1; p <= m; p++){
				if(mem[p] != -1){
					System.out.print(" "+Integer.toString(p));
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		new Main();
	}
}