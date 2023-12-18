import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

        char[] str_a = str.toCharArray();
        char[] str_1 = new char[4];
        char[] str_2 = new char[str.length()-4];
        for (int i=0;i<4;i++){
        	str_1[i] = str_a[i];
        }
        for (int i=4;i<str_a.length;i++){
        	str_2[i-4] = str_a[i];
        }
        String a = new String(str_1);
        String b = new String(str_2);
        String c = a+' '+b+'\n';
        System.out.println(a+" "+b);
	}

}