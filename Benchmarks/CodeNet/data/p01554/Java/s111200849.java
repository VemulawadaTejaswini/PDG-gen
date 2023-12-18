import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N, T;
	static HashSet<String> keySet = new HashSet<String>();
	static String[] event;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		if(!sc.hasNext())return false;
		N = sc.nextInt();
		for(int i = 0; i < N; i++){
			keySet.add(sc.next());
		}
		T = sc.nextInt();
		event = new String[T];
		for(int i = 0; i < event.length; i++){
			event[i] = sc.next();
		}
		return true;
	}
	
	static void solve(){
		boolean isLocked = true;
		for(int i = 0; i < event.length; i++){
			if(keySet.contains(event[i])){
				if(isLocked){
					System.out.println("Opened by " + event[i]);
					isLocked = false;
				}else{
					System.out.println("Closed by " + event[i]);
					isLocked = true;
				}
			}else{
				System.out.println("Unknown " + event[i]);
			}
		}
		keySet.remove(keySet);
	}
}