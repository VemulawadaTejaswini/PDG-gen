import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner as = new Scanner(System.in);
		String a = as.next();
		String l = "NO";
		int n = a.length();
		boolean t = true;
		int alice = 0;
		for(int i=0;i<(n-1)/4;i++){
			//System.out.println(a.charAt(i));
			//System.out.println(a.charAt((n-1)/2-i-1));
			if(String.valueOf(a.charAt(i)).equals(String.valueOf(a.charAt((n-1)/2-i-1)))){
				t = true;
			}else{
				//System.out.println(i);
				t = false;
				break;
			}
		}
		//System.out.println(alice);
		if(t){
			alice++;
		}
		//System.out.println(alice);
		t = true;
		for(int i=0;i<(n-1)/4;i++){
			//System.out.println(a.charAt((n+3)/2+i-1));
			//System.out.println(a.charAt(n-i-1));
			if(String.valueOf(a.charAt((n+3)/2+i-1)).equals(String.valueOf(a.charAt(n-i-1)))){
				t = true;
			}else{
				t = false;
				break;
			}
		}
		if(t){
			alice++;
		}
		//System.out.println(alice);
		t = true;
		for(int i=0;i<n/2;i++){
			//System.out.println(a.charAt((n+3)/2+i-1));
			//System.out.println(a.charAt(n-i-1));
			if(String.valueOf(a.charAt(i)).equals(String.valueOf(a.charAt(n-i-1)))){
				t = true;
			}else{
				t = false;
				break;
			}
		}
		if(t){
			alice++;
		}
		//System.out.println(alice);
		if(alice == 3){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}