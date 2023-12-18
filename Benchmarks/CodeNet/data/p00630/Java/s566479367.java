import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new B().doIt();
	}
	
	class B{
		
		String input;
		char type;
		
		void solve(){
			Data d = new Data(input);
//			System.out.println(Arrays.toString(d.input));
			if(type=='U')System.out.println(d.toU());
			else if(type=='L')System.out.println(d.toL());
			else if(type=='D')System.out.println(d.toD());
		}
		
		void doIt(){
			while(in.hasNext()){
				input = in.next();
				type = in.next().charAt(0);
				if(type=='X')break;
				solve();
			}
		}
		class Data{
			String[] input;
			int n;
			public Data(String a) {
				String[] test = a.split("_");
				if(test.length==1){
					String b = a.charAt(0)+"";
					for(int i=1;i<a.length();i++){
						if(Character.isUpperCase(a.charAt(i)))b+=" ";
						b+=a.charAt(i);
					}
					input = b.split(" ");
					n = input.length;
				}else{
					input = a.split("_");
					n = test.length;
				}
			}
			
			String toU(){
//				System.out.println(Arrays.toString(input));
//				System.out.println(n);
				String result = "";
				for(int i=0;i<n;i++){
					result += Character.toUpperCase(input[i].charAt(0));
					for(int s=1;s<input[i].length();s++)result += input[i].charAt(s);
				}
				return result;
			}
			
			String toL(){
				String result = toU();
				String result2 = Character.toLowerCase(result.charAt(0))+"";
				for(int i=1;i<result.length();i++)result2+=result.charAt(i);
				return result2;
			}
			
			String toD(){
				String result = Character.toLowerCase(input[0].charAt(0))+input[0].substring(1,input[0].length());
				for(int i=1;i<n;i++){
//					System.out.println(input[i]);
					result += "_";
					for(int s=0;s<input[i].length();s++){
//						System.out.println(result);
						result += Character.toLowerCase(input[i].charAt(s));
					}
				}
				return result;
			}
			
		}
	}
	

//	class B{
//		int n,a,b;
//
//		void solve(){
//			
//		}
//
//		void doIt(){
//			while(in.hasNext()){
//				n = in.nextInt();
//				a = in.nextInt();
//				b = in.nextInt();
//				if(n+a+b==0)break;
//				solve();
//			}
//		}
//	}
//
}