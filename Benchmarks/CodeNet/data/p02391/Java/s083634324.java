import java.util.Scanner;

class Main {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int a = (int)Integer.parseInt(sc.next());
    	int b = (int)Integer.parseInt(sc.next());

    	if(a<b){
    		System.out.println("a"+"\t"+"<"+"\t"+"b");
    	}else if (a>b) {
    		System.out.println("a"+"\t"+">"+"\t"+"b");
		}else if (a==b) {
			System.out.println("a"+"\t"+"=="+"\t"+"b");
		}
    }
}
