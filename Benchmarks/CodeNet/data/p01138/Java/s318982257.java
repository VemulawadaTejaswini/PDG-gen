
import javax.tools.JavaCompiler.CompilationTask;
public class Main {
	
	class C implements Comparable<C> {
		int startH;
		int startM;
		int startS;
		int endH;
		int endM;
		int endS;
		
		public C(String start , String end){
			String [] input = start.split(":");
			startH = Integer.parseInt(input[0]);
			startM = Integer.parseInt(input[1]);
			startS = Integer.parseInt(input[2]);
			input = end.split(":");
			endH = Integer.parseInt(input[0]);
			endM = Integer.parseInt(input[1]);
			endS = Integer.parseInt(input[2]);
			
		}
		@Override
		public int compareTo(C arg0) {
			if(startH < arg0.startH){
				return -1;
			}
			if(startH > arg0.startH){
				return 1;
			}
			else{
				if(startM < arg0.startM){
					return -1;
				}
				if(startM > arg0.startM){
					return 1;
				}
				else{
					if(startS < arg0.startS){
						return -1;
					}
					if(startS > arg0.startS){
						return 1;
					}
				}
				
			}
			return 0;
		}
		@Override
		public String toString() {
			return "C [startH=" + startH + ", startM=" + startM + ", startS="
					+ startS + ", endH=" + endH + ", endM=" + endM + ", endS="
					+ endS + "]";
		}
		
		
	}
	public boolean comp(C start, C end){
		if(start.startH < end.endH){
			return true;
		}
		else if(start.endH > end.endH){
			return false;
		}
		else{
			if(start.startM < end.endM){
				return true;
			}
			else if(start.endM > end.endM){
				return false;
			}
			else{
				if(start.startS < end.endS){
					return true;
				}
				else if(start.endS > end.endS){
					return false;
				}
				else{
					return true;
				}
			}
		}
	}
	
	private void doIt(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if( n == 0){
				break;
			}
			C [] data = new C[n];
			for(int i= 0; i < n ; i++){
				data[i] = new C(sc.next(), sc.next());
			}
			Arrays.sort(data);
			
			int max = 1;
			for(int i=1; i < n; i++){
				int count = 1;
				for(int j=i-1; j >= 0; j--){
					if(comp(data[i], data[j])){
						count++;
					}	
				}
				max = Math.max(max, count);
			}
			System.out.println(max);
		}
		
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}

}