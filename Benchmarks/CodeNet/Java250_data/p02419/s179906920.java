import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String w = sc.nextLine().toLowerCase();
		int count=0;
		
		while(true){
			String[] line = sc.nextLine().split(" ");
			if(line[0].equals("END_OF_TEXT")){
				break;
			}
			for(int i=0;i<line.length;i++){
				if(w.equals(line[i].toLowerCase())){
					count+=1;
				}
			}
		}
		System.out.println(count);
	}
}	