import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		String[] str = new String[n];
		for(int i = 0;i < n;i++){
			str[i] = scan.nextLine();
		}
		for(int i = 0;i < n;i++){
			String[] sa = str[i].split(" ");
			int len = sa.length;
			for(int j = 0;j < len;j++){
				if(sa[j].equals("Hoshino")){
					sa[j] = "Hoshina";
				}
				if(j == len-1){
					System.out.println(sa[j]);
				}else{
					System.out.print(sa[j]+" ");
				}
			}
		}
	}
}