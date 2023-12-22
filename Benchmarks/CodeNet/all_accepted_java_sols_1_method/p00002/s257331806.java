import java.util.*;
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int a = sc.nextInt(); 
			int b = sc.nextInt();
			int ans=a+b;
			int count=0;
			while(ans>=1){
				ans=ans/10;
				count++;
			}
			System.out.println(count);
		}
	}
}