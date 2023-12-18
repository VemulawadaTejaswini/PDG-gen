import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String[] stra = (scan.nextLine()).split(" ");
			String[] strb = (scan.nextLine()).split(" ");
			
			int suma = 0;
			int sumb = 0;
			for(int i = 0;i < 4;i++){
				suma += Integer.parseInt(stra[i]);
				sumb += Integer.parseInt(strb[i]);
			}
			if(suma >= sumb){
				System.out.println(suma);
			}else{
				System.out.println(sumb);
			}
			
		}
	}
}