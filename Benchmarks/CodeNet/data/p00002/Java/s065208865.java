public class Main{
public static void main(String args[]) throws IOException{
	Scanner s = new Scanner(System.in);
	int a,b;
	while(s.hasNext()){
		a=s.nextInt();
		b=s.nextInt();
		String t=((Integer)(a+b)).toString();
		System.out.println(t.length());
	}
	



}}