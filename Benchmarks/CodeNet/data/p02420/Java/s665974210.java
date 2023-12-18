import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str,move;
		int shuffle,cards;
		while(true){
			str=sc.next();
			if(str.equals("-")){
				break;
			}
			else{
				shuffle=sc.nextInt();
				for(int i=0;i<shuffle;i++){
					cards=sc.nextInt();
					move=str.substring(0,cards);
					str=str.replaceFirst(move,"");
					str+=move;
				}
				System.out.println(str);
			}
		}
	}
}
