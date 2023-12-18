import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	char[] out = {'A','B','C'};
	while(s.hasNext())
	    swap(s.next(),out);
	int i = 0;
	while(out[i] != 'A')
	    i++;
	char output = 'C';
	if(i==0)
	    output = 'A';
	if(i==1)
	    output = 'B';
	System.out.println(output);
    }

    public static void swap(String in,char[] out) {
	char a = in.charAt(0);
	char b = in.charAt(2);
	int k = 0, j = 0;
	while(out[k] != a)
	    k++;
	while(out[j] != b)
	    j++;
	out[k] = b;
	out[j] = a;
    }
}