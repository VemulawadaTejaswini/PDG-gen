import java.util.Scanner;
 class Main1{
 	
	
	public void solve(){
		Scanner sc =new Scanner(System.in);
		
		int stok,syurui;
		int a = 0;
		int hairetsu[];
		syurui = sc.nextInt();
		hairetsu = new int[syurui];
		
		for(int b = 0; b<syurui; b++){
			stok =sc.nextInt();
			hairetsu[a] = stok;
			a+=1;
		}
		for(int p=0;p<syurui;p++){
			if(hairetsu[p] == 0){
				System.out.print("N#A");
			}else if(syurui ==1){
				System.out.print(2);
			}else{
			System.out.print(syurui+1);
			}
		}
 }
	public static void main(String[] args){
		Main1 obj = new Main1();
		obj.solve();
	}
}