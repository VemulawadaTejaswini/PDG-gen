import java.util.*;

public class Main{
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String s = sc.next();
			while(s.length() > 0){
				int prevlen = s.length();
				s = s.replaceAll("mmewe", "me").replaceAll("emeww", "ew");
				if(s.length() == prevlen){
					break;
				}
			}
			System.out.println(s.equals("mew") ? "Cat" : "Rabbit");
		}
	}
	

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}