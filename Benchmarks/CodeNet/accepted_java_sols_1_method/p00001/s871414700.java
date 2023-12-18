import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
	final Scanner sc = new Scanner(System.in);
	Integer[] ar=new Integer[10];
	for(int i=0;i<10;i++) ar[i]=sc.nextInt();
	Arrays.sort(ar,Collections.reverseOrder());
	for(int i=0;i<3;i++) System.out.println(ar[i]);
    }
}