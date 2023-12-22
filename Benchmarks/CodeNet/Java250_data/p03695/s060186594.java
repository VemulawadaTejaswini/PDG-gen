import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

	Scanner std = new Scanner(System.in);
	List<Integer> list = new ArrayList<>();
	int N = std.nextInt();

	int gray = 0;
	int tea = 0;
	int green = 0;
	int lightblue = 0;
	int blue = 0;
	int yellow = 0;
	int orange = 0;
	int red = 0;
	int rainbow1 = 0;
    int rainbow2 = 0;

    int min = 0;
    int max = 0;

	for(int i = 0; i < N; i++) {
	   int a = std.nextInt();
	   list.add(a);
	}
	for(int i = 0; i < N; i++) {
	int x = list.get(i);

	if(1 <= x && x <= 399) {
		gray = 1; }

	if(400 <= x && x <= 799) {
	    tea = 1;}

	if(800 <= x && x <= 1199) {
		green = 1;
	}

	if(1200 <= x && x <= 1599) {
		lightblue = 1;
	}

	if(1600 <= x && x <= 1999) {
		blue = 1;
	}

	if(2000 <= x && x <= 2399) {
		yellow = 1;
	}

	if(2400 <= x && x <= 2799) {
		orange = 1;
	}

	if(2800 <= x && x <= 3199) {
		red = 1;
	}

	if(3200 <= x && x <= 4800 ) {
		rainbow1 = 1;
		rainbow2++;
	}


	}

	if(gray + tea + green + lightblue + blue + yellow + orange + red  == 0) {
	min = 1;
	}

	else {
		min = gray + tea + green + lightblue + blue + yellow + orange + red;
	}

	max = gray + tea + green + lightblue + blue + yellow + orange + red + rainbow2;

	System.out.println(min + " " + max);


	}
}
