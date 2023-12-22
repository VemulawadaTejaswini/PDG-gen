import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
int num[] = new int[5];
int mins,mine;
for(int i=0;i<5;i++)
{
num[i]=sc.nextInt();
}
mins=60*num[0]+num[1];
mine=60*num[2]+num[3]-num[4];

System.out.println(mine-mins);
	}

}
