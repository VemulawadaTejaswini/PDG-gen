import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int col=scanner.nextInt();
		int row=scanner.nextInt();
		while(col!=0&&row!=0){
			scanner.nextLine();
			StringBuffer bf=new StringBuffer();
			//bf.delete(0,bf.length());
			for(int i=0;i<row;i++){
				bf.append(scanner.nextLine().trim());
			}
			bf.trimToSize();
			
			char c;
			int result=0;
			List<Integer> list=new ArrayList<Integer>();
			for(int j=0;j<bf.length();j++){
				if(list.contains(j)){
					continue;
				}
				c=bf.charAt(j);
				list.add(j);
				result++;
				for(int k=list.size()-1;k<list.size();k++){
					int pos=list.get(k);
					if(pos>col-1&&bf.charAt(pos-col)==c&&!list.contains(pos-col)){
						list.add(pos-col);
					}
					if(pos%col+1<col&&bf.charAt(pos+1)==c&&!list.contains(pos+1)){
						list.add(pos+1);
					}
					if(pos+col<bf.length()&&bf.charAt(pos+col)==c&&!list.contains(pos+col)){
						list.add(pos+col);
					}
					if(pos%col-1>=0&&bf.charAt(pos-1)==c&&!list.contains(pos-1)){
						list.add(pos-1);
					}
				}
			}
			System.out.println( result);
			col=scanner.nextInt();
			row=scanner.nextInt();
		}
		scanner.close();

	}

}