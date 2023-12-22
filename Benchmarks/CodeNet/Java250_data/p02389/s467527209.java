import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    	//System.out.println("数字を入力してください");
    	Scanner sc = new Scanner(System.in);
    	int a = Integer.parseInt(sc.next());
    	int b = Integer.parseInt(sc.next());
        System.out.println(a*b+" "+(a+b)*2);
    }
}

