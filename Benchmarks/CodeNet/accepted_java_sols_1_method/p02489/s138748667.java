import java.io.*;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
	int i=1;
	Scanner sc=new Scanner(System.in);
        while (true){
            int	n=sc.nextInt();
            if (n==0)
		break;
            System.out.println("Case "+i+": "+n);
            i++;
        }
    }
}