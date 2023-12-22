
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n[][] = new int[3][3];
		int total = 0;
		for(int i = 0;i<3;i++){
			for(int j = 0;j<3;j++){
				int a = sc.nextInt();
				total+=a;
				n[i][j] = a;
			}
		}String ans = "Yes";
		for(int i = 0;i<1;i++){
			if(total%3!=0){
				ans = "No";break;
			}total/=3;
			if((n[0][0]+n[1][1]+n[2][2])!=total||(n[0][2]+n[1][1]+n[2][0])!=total){
				ans = "No";break;
			}
		}System.out.println(ans);
	}
}