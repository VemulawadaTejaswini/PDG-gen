import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int[] dat = new int[10];
	for(int tc = 0; tc < 10; ++tc) {
	    dat[tc] = s.nextInt();
	}
	Arrays.sort(dat);
	for(int i = 0; i < 3; ++i) {
	    System.out.println(dat[9-i]);
	}
    }
}