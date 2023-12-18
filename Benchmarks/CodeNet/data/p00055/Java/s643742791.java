import java.util.*;


public class YOBI {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new YOBI();
	}
	public YOBI() {
		new aoj0055().doIt();
	}
	class aoj0055{
		void change(int a[]){
			a[3] = 1;
		}
		void doIt() {
			int a[] = {1,2,3,4,5};
			for(int i = 0;i < 5;i++){
				System.out.print(a[i] +" ");
			}
			change(a);
			for(int i = 0;i < 5;i++){
				System.out.print(a[i] +" ");
			}
		}
	}
}