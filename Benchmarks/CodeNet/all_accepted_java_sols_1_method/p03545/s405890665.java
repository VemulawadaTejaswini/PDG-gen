import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan =new Scanner(System.in);
		String s = scan.next();
		int ans = Integer.parseInt(String.valueOf(s.charAt(0)));
		for (int i = 0; i <8; ++i){
			ans=Integer.parseInt(String.valueOf(s.charAt(0)));
			for (int j =0;j < 3; ++j){//ビット全探索
				if ((1&i>>j)==1){
					ans+=Integer.parseInt(String.valueOf(s.charAt(j+1)));
				}else{
					ans-=Integer.parseInt(String.valueOf(s.charAt(j+1)));
				}
			}
			if (ans==7){
				System.out.print(s.charAt(0));
				for (int j =0;j < 3; ++j){
					if ((1&i>>j)==1){
						System.out.print("+"+String.valueOf(s.charAt(j+1)));
					}else{
						System.out.print("-"+String.valueOf(s.charAt(j+1)));
					}
				}
				System.out.print("=7");
				break;
			}
		}


	}
}
//end
