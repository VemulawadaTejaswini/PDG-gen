import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String w = sc.next();
		int count = 0;
		boolean judge = true;
		while(judge){
			if(0 == w.length()){
				System.out.println("Yes");
				break;
			}else{
				char a = w.charAt(0);
				for (int i = 0; i < w.length(); i++) {
					if(a == w.charAt(i)){
						count++;
					}
					if(i == w.length() -1){
						if(count%2 == 0){
							w = w.replaceAll(String.valueOf(a), "");
							count = 0;
						}else{
							System.out.println("No");
							judge = false;
							break;
						}
					}
				}
			}
		}
		sc.close();
	}
}
