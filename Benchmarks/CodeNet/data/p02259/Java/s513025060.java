import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    int num = 0;
    for(int i = 0; i < n; i++){
      a[i] = sc.nextInt();
    }
	for(int i = 1; i < n+1; i++){
    	for(int j = 0; j < n-i; j++){
      		if(a[j] > a[j+1]){
        		int work = a[j];
        		a[j] = a[j+1];
        		a[j+1] = work;
       			num++;
      		}
    	}
	}
    for(int i = 0; i < n-1; i++){
      System.out.print(a[i] + " ");
    }
    System.out.println(a[n-1] + "\n" + num);
  }
}

