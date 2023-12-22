import java.util.Scanner;

class Main {
	public static void main(String args[]){
		int n,Taro=0,Hanako=0;
		String t,h;
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		
		for(int i=0;i<n;i++){
			t = scan.next();
			h = scan.next();
			if(t.compareTo(h)>0){
				Taro+=3;
			}else if(t.compareTo(h) == 0){
				Taro+=1;
				Hanako+=1;
			}else{
				Hanako+=3;
			}
		}
		
		System.out.println(Taro+" "+Hanako);
	}
}