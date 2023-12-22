import java.util.*;

class Main{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		String C = sc.next();
		
		char D = C.charAt(0);
		
		int ans = D + 1;
		//char�^��int������ƃL���X�g���N����̂�int�Ōv�Z���čŌ�Ɍ^�ϊ�����΂悢
		
		System.out.println("" + (char)ans);
	}
}