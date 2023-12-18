import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			String[] line = sc.nextLine().split(" ");
			int m = Integer.parseInt(line[0]);
			int f = Integer.parseInt(line[1]);
			int r = Integer.parseInt(line[2]);
		//finish	
			if(m==-1 && f==-1 && r==-1){
				break;
			}
			int sum = m+f;
		//out
			if(m==-1 || f==-1){
				System.out.println("F");
			}else if(sum>=80){
				System.out.println("A");
			}else if(sum>=65 && sum<80){
				System.out.println("B");
			}else if(sum>=50 && sum<65){
				System.out.println("C");
			}else if(sum>=30 && sum<50){
				if(r>=50){
					System.out.println("C");
				}else{
					System.out.println("D");
				}
			}else if(sum<30){
				System.out.println("F");
			}
		}
	}
}