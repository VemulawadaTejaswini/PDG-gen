import java.util.Scanner;
class Main{
 
    public void solve(){
        Scanner sc = new Scanner(System.in);
		int syurui, kaisu;
		int kazu;
		int i[] = new int[100];
		
			syurui = sc.nextInt();
			while(0!=syurui){
				kazu = 0;
						kaisu= 1;
				for(int t = 1; t <= syurui; t++){
					i[t] = sc.nextInt();
			
					if(i[t] >= 2){
						kazu = kazu + 1;
					}
					if(i[t] > 0){
						kaisu = kaisu +1;
					}
				}
				if(kazu > 0){
					System.out.println(kaisu);
				}else{
					System.out.println("NA");
				}
				syurui = sc.nextInt();
			}
    }
    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
}