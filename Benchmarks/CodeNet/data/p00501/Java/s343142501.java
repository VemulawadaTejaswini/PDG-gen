import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0576().doIt();
	}
	
	class AOJ0576{
		String kan;
		void doIt(){
			int n = in.nextInt();
			kan = in.next();
			int cnt = 0;
			for(int i=0;i<n;i++){
				cnt+=get_Kanban(in.next());
			}
			System.out.println(cnt);
		}
		
		int get_Kanban(String input){
			int n = input.length();
			for(int i=0;i<n;i++){// 何文字目から始めるか
				for(int s=1;s<n;s++){// 間隔
					String a = "";
					for(int k=i;k<n;k+=s){// 文字場所
						if(a.length()==kan.length())break;
						a+=input.charAt(k);
					}
					if(a.equals(kan))return 1;
				}
			}
			return 0;
		}
	}
}