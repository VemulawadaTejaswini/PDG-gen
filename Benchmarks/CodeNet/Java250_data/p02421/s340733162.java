public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int n = scan.nextInt();
		String taro;
		String hana;
		int countt = 0;
		int counth = 0;

		for(int i = 0; i < n;i++){
			taro = scan.next();
			hana = scan.next();

			if(taro.compareTo(hana) > 0){
				countt += 3;
			}else if(taro.compareTo(hana) < 0){
				counth += 3;
				}else{
					countt++;
					counth++;
				}
			}
		System.out.println(countt +" "+counth);
	}

}