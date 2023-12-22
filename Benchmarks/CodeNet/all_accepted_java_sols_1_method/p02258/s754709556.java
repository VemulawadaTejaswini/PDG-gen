import java.util.Scanner;

class Main{
  public static void main(String args[]){

	int n;
	int temp;
	int max = Integer.MIN_VALUE;
	int i;

	Scanner scan = new Scanner(System.in);

	n =  scan.nextInt();
	int m[] = new int[n];
	for(i=0; i<n ; i++)
		m[i] = scan.nextInt();

	temp = m[0];
	for(i=1 ; i<n ; i++){
		if(m[i]-temp > max)
			max = m[i]-temp;
		if(temp > m[i])
			temp = m[i];
	}

	System.out.println(max);

	return;

  }

}