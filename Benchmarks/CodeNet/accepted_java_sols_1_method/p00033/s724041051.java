import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner canner=new Scanner(System.in);
		int num=Integer.parseInt(canner.nextLine().trim());
		for(int i=0;i<num;i++){
			String line=canner.nextLine().trim();
			String[] ls=line.split(" ");
			int MinA=-1;
			int MinB=-1;
			boolean result=true;
			for(String s:ls){
				if(Integer.parseInt(s)>MinA){
					MinA=Integer.parseInt(s);
				}else if(Integer.parseInt(s)>MinB){
					MinB=Integer.parseInt(s);
				}else{
					result=false;
					break;
				}
			}
			
			System.out.printf("%s\n", result? "YES":"NO");
		}
		canner.close();

	}

}