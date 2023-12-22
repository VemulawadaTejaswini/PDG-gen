import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner cin=new Scanner(System.in);
        int num1 = cin.nextInt();
        int num2 = cin.nextInt();
        int count = 0;
        for (int i = num1; i <= num2; i++) {
        	String numstr = String.valueOf(i);
        	String f, r;
        	int len = numstr.length();
        	if (len % 2 == 0) {
        		f = numstr.substring(0, len / 2);
        		r = numstr.substring(len / 2, len);
        	} else {
        		f = numstr.substring(0, len / 2);
        		r = numstr.substring(len / 2 + 1, len);
        	}
        	if (f.equals((new StringBuffer(r)).reverse().toString())) {
        		count++;
        	}
        }
        System.out.println(count);
    }
}