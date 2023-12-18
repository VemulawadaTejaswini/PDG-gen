import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static Employee[] employee = new Employee[4001];
	static List <Employee> list = new ArrayList<Employee>();
	static int n;
	static class Employee implements Comparable<Employee>{
		public int id;
		public int order;
		public long score;
		public int compareTo(Employee e){
			return this.order - e.order;
		}
	}
	public static void main(String[] args) {
		while(read()){
			solve();
		}

	}
	
	static boolean read(){
		n = sc.nextInt();
		if(n == 0)return false;
		for(int i = 0; i < n; i++){
			int id = sc.nextInt();
			if(employee[id] == null){
				employee[id] = new Employee();
				employee[id].id = id;
				employee[id].order = id+1;
			}
			long number = sc.nextLong();
			long value = sc.nextLong();
			employee[id].score += number * value;
		}
		return true;
	}

	static void solve(){
		boolean nothing = true;
		for(int i = 0; i < 4001; i++){
			if(employee[i] != null && employee[i].score >= 1000000){
				System.out.println(i);
				nothing = false;
			}
			employee[i] = null;
		}
		if(nothing)System.out.println("NA");
		
	}
	
}