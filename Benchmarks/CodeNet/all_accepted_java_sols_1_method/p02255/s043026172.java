import java.util.*;

class Main{
  public static void main(String args[]){

	int n;
	int i, j;
	int v;
	Scanner scan = new Scanner(System.in);
	String str = new String();

	n =  scan.nextInt();
	int A[] = new int[n];

	for(i=0; i<n; i++)
		A[i] = scan.nextInt();

	for(i=0; i<n ; i++){
		v = A[i];
		j = i-1;
		while(j >= 0 && A[j] > v){
			A[j+1] = A[j];
			j--;
		}
		A[j+1] = v;
		str = Arrays.toString(A);
		str = str.replaceAll("\\[|\\]|,","");
		System.out.println(str);
	}

	return;

  }

}