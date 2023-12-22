import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	int sec = x%60;
	int min = ((x-sec)/60)%60;
        int hou = ((x-sec)/60-min)/60;
	System.out.printf("%d:%d:%d\n",hou,min,sec); 
    }
}

