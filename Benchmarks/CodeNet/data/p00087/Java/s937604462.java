import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		while(sc.hasNext()){
			Stack<Double> st = new Stack<Double>();
			String str[] = sc.nextLine().split(" ");
			for(int i = 0;i < str.length;i++){
				if(str[i].equals("+")){
					double x1 = st.pop();
					double x2 = st.pop();
					st.push(x1 + x2);
				}else if(str[i].equals("-")){
					double x1 = st.pop();
					double x2 = st.pop();
					st.push(x2 - x1);
				}else if(str[i].equals("*")){
					double x1 = st.pop();
					double x2 = st.pop();
					st.push(x1 * x2);
				}else if(str[i].equals("/")){
					double x1 = st.pop();
					double x2 = st.pop();
					st.push(x2 / x1);
				}else{
					st.push(Double.parseDouble(str[i]));
				}
			}
			double ans = st.pop();
			System.out.println(ans);
		}
	}
	public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	new Main().doIt();
    }
}