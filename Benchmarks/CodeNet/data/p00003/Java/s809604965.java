import java.util.Scanner;
 
public class Main {
  public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int a , b , c , max_num1, max_num2;
	int res_flg;
	//String n = s.next();
	int n = Integer.parseInt(s.nextLine());
	for(int i = 0;i<n;i++){
		String line = s.nextLine();
		String[] array = line.split(" ",0);
		a = Integer.parseInt(array[0]);
		b = Integer.parseInt(array[1]);
		c = Integer.parseInt(array[2]);
 
		if(a >= b && a >= c){
			if(a*a == b*b+c*c){
				res_flg = 1;
			}else{
				res_flg = 0;
			}
		}
		else if(b >= a && b >= c){
			if(b*b == a*a+c*c){
				res_flg = 1;
			}else{
				res_flg = 0;
			}
		}
		else if(c >= a && c >= b){
			if(c*c == b*b+a*a){
				res_flg = 1;
			}else{
				res_flg = 0;
			}
		}else{
			res_flg = 0;
		}
		if(res_flg == 0){
			System.out.println("NO");
		}else{
			System.out.println("YES");
		}
	}
  }
}