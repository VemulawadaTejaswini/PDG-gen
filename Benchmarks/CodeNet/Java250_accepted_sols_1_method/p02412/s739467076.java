public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		while(true){
			int n = scan.nextInt();
			int x = scan.nextInt();
			int a,b,c = 1;
			int count = 0;

			if(n == 0 && x == 0){
				break;
			}
			for(a = 1;a<=n;a++){
				for(b = a;b<=n;b++){
					for(c = b;c<=n;c++){
						if(x == (a+b+c) && (a!=b) && (b!=c) && (c!=a)){
							count ++;
							break;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}