import java.util.Scanner;

public class Main{
    public static void main(String[]args){
	Scanner kbd = new Scanner(System.in);
	int n = kbd.nextInt();

	int[] data = new int[n];
	int max,min,s;

	int i = 0;
	while(i<n){
	    data[i] = kbd.nextInt();
	    i++;
	}

	max = data[0];
	min = data[0];
	s = data[0];
	for(int j=1; j<n; j++){
	    if(data[j]>max) max = data[j];
	    if(data[j]<min) min = data[j];
	    s = s + data[j];
	}
	System.out.println(min+" "+max+" "+s);
    }
}