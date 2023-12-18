import java.io.BufferedReader;
//import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException {
	//System.setIn(new FileInputStream("./input2.txt"));
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(br.readLine());

	int[] a = new int[n];
	String[] s = br.readLine().split(" ");
    for(int i = 0; i < n; ++i){
        a[i] = Integer.parseInt(s[i]);
    }
    
    int cost = 0;
    for(int i = 0; i < n; ++i){
        int maxj = i;
        for(int j = i; j < n; ++j){
            if(a[maxj] > a[j]){
                maxj = j;
            }
        }
        if(maxj != i){
            int tmp = a[maxj];
            a[maxj] = a[i];
            a[i] = tmp;
            cost += a[maxj] + a[i];
        }   
    }
    /*
    for(int i = 0; i < n; ++i){
    	System.out.print(" " + a[i]);
    }
    System.out.println();*/
    System.out.println(cost);
  }
}