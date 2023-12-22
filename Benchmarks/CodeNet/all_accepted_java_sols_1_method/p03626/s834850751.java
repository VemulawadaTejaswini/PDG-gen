import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		long ans=0;
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String s1 = sc.next();
		String s2 = sc.next();
		
		char c1Next = s1.charAt(0);
		char c2Next = s2.charAt(0);
		
		boolean yokoFlg = false;
		
		if(c1Next == c2Next){
			ans = 3;
		}
		else{
			ans = 6;
			yokoFlg = true;
		}
		
		for(int i=1; i<s1.length(); i++){
			
			if(yokoFlg == true){
				yokoFlg = false;
				continue;
			}
			
			char c1Pre = c1Next;
			char c2Pre = c2Next;
			
			c1Next = s1.charAt(i);
			c2Next = s2.charAt(i);
			
			//縦
			if(c1Pre == c2Pre){
				if(c1Next == c2Next){
					ans *= 2;
				}
				else{
					ans *= 2;
					i++;
				}
				
			}
			//横
			else{
				if(c1Next == c2Next){
					ans *= 1;
				}
				else{
					ans *= 3;
					i++;
				}
			}
			/*
			System.out.println("c1Pre:" + c1Pre);
			System.out.println("c2Pre:" + c2Pre);
			System.out.println("c1Next:" + c1Next);
			System.out.println("c2Next:" + c2Next);
			System.out.println("ans:"+ ans);
			*/
		}
		System.out.println(ans%1000000007);
	}

}