import java.util.Scanner;

public class Main{

public static void main(String [] args){
Scanner in = new Scanner(System.in);
int count = 0;
while(in.hasNextLine()){
if( i == 2 || i == 3 || i == 5 || i == 7 ||
   (((i % 10 == 1) || (i % 10 == 3) || (i % 10 == 7) || (i % 10 == 9))  
    && (i % 3 != 0 || i % 7 != 0))){
				count++;
			}
}

System.out.println(count);
