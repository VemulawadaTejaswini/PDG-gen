import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int before=-1;
		int get;
		String str = "";
		while(n!=0){
			for(int i=0;i<n;i++){
				get = sc.nextInt();
				if(get-before!=1){
					if(before==-1){
						str += String.valueOf(get);
					} else {
						str += "-"+String.valueOf(before)+" "+String.valueOf(get);
					}
				} else if(i==n-1){
					str += "-"+String.valueOf(get);
				}
				before = get;
			}
			System.out.println(str);
			n = sc.nextInt();
			str = "";
			before = -1;
		}
	}

}