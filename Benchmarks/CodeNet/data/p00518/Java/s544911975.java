import java.util.Scanner;
 
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int sum = 0;
        int[] a = new int [7];
        int[] b = new int [7];
        char name[] =in.next().toCharArray();
        a[0] = 1; a[3] = 0; a[4] = 0; a[6] = 0;
        a[1] = 0; a[2] = 0; a[5] = 0;
        for(int i = 0;i < N;i++){
        	sum = 0;
        	if(name[i] == 'J'){
        		b[0] = a[0] + a[3] + a[4] + a[6];
        		b[3] = a[0] + a[1] + a[3] + a[4] + a[5] + a[6]; 
        		b[4] = a[0] + a[2] + a[3] + a[4] + a[5] + a[6];
        		b[6] = a[0] + a[1] + a[2] + a[3] + a[4] + a[5] + a[6];
        		b[1] = 0;b[2] = 0;b[5] = 0;
        	}
        	if(name[i] == 'O'){
        		b[1] = a[1] + a[3] + a[5] + a[6];
        		b[3] = a[0] + a[1] + a[3] + a[4] + a[5] + a[6]; 
        		b[5] = a[1] + a[2] + a[3] + a[4] + a[5] + a[6];
        		b[6] = a[0] + a[1] + a[2] + a[3] + a[4] + a[5] + a[6];
        		b[0] = 0;b[2] = 0;b[4] = 0;
        	}
        	if(name[i] == 'I'){
        		b[2] = a[2] + a[4] + a[5] + a[6];
        		b[4] = a[0] + a[2] + a[3] + a[4] + a[5] + a[6]; 
        		b[5] = a[1] + a[2] + a[3] + a[4] + a[5] + a[6];
        		b[6] = a[0] + a[1] + a[2] + a[3] + a[4] + a[5] + a[6];
        		b[0] = 0;b[1] = 0;b[3] = 0;
        	}
        	for(int j = 0;j < 7;j++){
        		a[j] = b[j];
        		if(a[j] > 10070000){
        			a[j] = a[j] % 100070000;
        		}
        	}
        }
        for(int j = 0;j < 7;j++){
        	sum = sum + a[j];
        }
    	sum = sum % 10007;
        System.out.println(sum);
	}
}