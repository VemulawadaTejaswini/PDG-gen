import java.util.Scanner;
import java.util.Arrays;


public class Main{

public static void main(String[] args){

	int[] x;
	int i;

	char w='a',ch;
	String line;
	Scanner sc = new Scanner(System.in);

	x=new int[26];
	Arrays.fill(x,0);

	while(sc.hasNextLine()){
		line = sc.nextLine();
		for(i=0;i<line.length();i++){
			ch=Character.toLowerCase(line.charAt(i));
			for(i=0;i<26;i++){

				if(ch==w+i){

					x[i]++;

				}

			}
		}

		

	}

	for(i=0;i<26;i++){

		System.out.printf("%c : %d\n",w,x[i]);

		w++;

	}



}
}