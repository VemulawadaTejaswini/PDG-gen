import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		while(true){
			String line = sc.nextLine();
			if(line.equals("0")){
				break;
			}
			int sum=0;
			for(int i=0;i<line.length();i++){
				sum+=Integer.parseInt(line.substring(i,i+1));
			}
			System.out.println(sum);
		}
	}
}