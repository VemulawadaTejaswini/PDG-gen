import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		String abc = scan.nextLine();
		String xyz = scan.nextLine();
		int i = 0;
		int j = 0;
		for(i = 0; i < abc.length(); i++, j++){
			System.out.print(abc.substring(i,i+1));
			if(j < xyz.length()){
				System.out.print(xyz.substring(j, j+1));
			}
		}
	}
}
