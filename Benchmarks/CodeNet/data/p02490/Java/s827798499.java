import java.util.*;
class Main{
	public static void print(Object o){
		System.out.println(o);
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int i[] = new int [100000];
		int p[] = new int [100000];
		int n = 1;
		i[n] = 1;
		p[n] = 1;
		while(true){
			i[n] = in.nextInt();
			p[n] = in.nextInt();
			if(i[n] == 0 && p[n] == 0){
				break;
			}else{
				if(p[n] < i[n]){
					print(p[n]+ " " + i[n]);
				}else{
					print(i[n]+ " " + p[n]);
				}
				n++;
			}
		}
	}
}