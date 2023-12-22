import java.util.Scanner;
import java.util.Arrays;
 
public class Main
{
    public static void main(String[] args)
    {
	Scanner cin = new Scanner(System.in);
	int N = cin.nextInt();
	for(int i=1; i<=N; i++){
		int[] len = new int[3];
		for(int j=0; j<3; j++){ len[j] = cin.nextInt();}
		Arrays.sort(len);
		if(len[0]*len[0] + len[1]*len[1] == len[2]*len[2]){System.out.println("YES");} else{System.out.println("NO");}
	}
    }
}