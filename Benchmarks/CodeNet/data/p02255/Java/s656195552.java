import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int A[] = new int[N];
	int i,j,v;
	for(i = 0; i < N; i++)
	    A[i] = sc.nextInt();
	for(i = 0; i < N; i++){
	    v = A[i];
	    j = i - 1;
	    while(j >= 0 && A[j] > v){
		A[j+1] = A[j];
		j--;
		A[j+1] = v;
	    }
	    for(int a : A) System.out.print(a + " ");
	    System.out.println(); 
	}
    }
}
