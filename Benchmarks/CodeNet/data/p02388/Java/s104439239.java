public class Main{
    public static int CUBIC = 3;
    public static void main(String[] args) {
	String a = args[0];
	int x = Integer.parseInt(a);
	int xcubic = 1;
	for (int i = 0; i < CUBIC; i++) {
	    xcubic *= x;
	}
	System.out.println(xcubic);
    }
}