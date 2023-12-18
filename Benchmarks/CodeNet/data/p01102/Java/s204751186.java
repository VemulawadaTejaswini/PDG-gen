import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		String str2;
		while(!str1.equals(".")){
			str2 = scan.nextLine();
			if(str1.equals(str2)){
				System.out.println("IDENTICAL");
			}else{
				int i = 0;
				int j = 0;
				boolean check1 = false;
				boolean check2 = false;
				String tmp1;
				String tmp2;
				int start1 = 0;
				int start2 = 0;
				int cnt = 0;
				while(str1.length() > i || str2.length() > j){
					while(true){
						if(i == str1.length()){
							tmp1 = null;
							break;
						}else if(str1.charAt(i) == '"' && !check1){
							if(i == 0){
								tmp1 = str1.substring(start1, i + 1);
							}else{
								tmp1 = str1.substring(start1, i);
							}
							start1 = i;
							i++;
							check1 = true;
							break;
						}else if(str1.charAt(i) == '"'){
							tmp1 = str1.substring(start1, i + 1);
							start1 = i + 1;
							i++;
							check1 = false;
							break;
						}else if(i == str1.length() - 1){
							tmp1 = str1.substring(start1, i + 1);
							i++;
							check1 = true;
							break;
						}
						i++;
					}
					
					while(true){
						if(j == str2.length()){
							tmp2 = null;
							break;
						}else if(str2.charAt(j) == '"' && !check2){
							if(j == 0){
								tmp2 = str2.substring(start2, j + 1);
							}else{
								tmp2 = str2.substring(start2, j);
							}
							start2 = j;
							j++;
							check2 = true;
							break;
						}else if(str2.charAt(j) == '"'){
							tmp2 = str2.substring(start2, j + 1);
							start2 = j + 1;
							j++;
							check2 = false;
							break;
						}else if(j == str2.length() - 1){
							tmp2 = str2.substring(start2, j + 1);
							j++;
							check2 = true;
							break;
						}
						j++;
					}
					
					if(tmp1 != null && tmp2 != null && !check1 && !check2 && !tmp1.equals(tmp2)){
						cnt++;
					}
					
					if(tmp1 == null || tmp2 == null){
						System.out.println("DIFFERENT");
						break;
					}else if(check1 && check2 && !tmp1.equals(tmp2)){
						System.out.println("DIFFERENT");
						break;
					}else if(i == str1.length() && j == str2.length() && cnt == 1){
						System.out.println("CLOSE");
						break;
					}else if(i == str1.length() && j == str2.length()){
						System.out.println("DIFFERENT");
						break;
					}
				}
			}
			str1 = scan.nextLine();
		}
	}
}
