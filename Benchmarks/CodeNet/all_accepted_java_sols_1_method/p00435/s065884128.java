import java.util.Scanner;

class Main{

	static String[] str = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		String str2 = scan.next();
		String[] str3 = str2.split("");

		for(int i=0;i<str3.length;i++){
			for(int j=0;j<26;j++){
				if(str3[i].equals(str[j])){
					int a = j-3;
					if(a<0){
						a=26+a;
					}
					System.out.print(str[a]);
				}
			}
		}

		System.out.println("");
	}			

}