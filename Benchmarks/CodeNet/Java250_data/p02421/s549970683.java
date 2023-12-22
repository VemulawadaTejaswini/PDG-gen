import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);
			int hanako = 0;
			int tarou = 0;
			int n = scan.nextInt();
			for(int i = 0; i < n;i++){
				String a = scan.next();
				String b = scan.next();
				int check = a.compareTo(b);
				if(check <0){
					hanako += 3;
				}else if(check > 0){
					tarou += 3;
				}else{
					hanako++;
					tarou++;
				}
			}
			System.out.println(tarou +" "+hanako);
		}finally{
			if(scan!=null)scan.close();
		}
	}
}