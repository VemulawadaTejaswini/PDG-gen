import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        	while(true) {
        		int n = sc.nextInt();
        		int m = sc.nextInt();
        		int a = sc.nextInt();
        		if(n==0 && m==0 && a==0) break;
        		
        		int [][] line = new int[m][3];
        		for(int i=0;i<m;i++) {
        			for(int j=0;j<3;j++) {
        				line[i][j] = sc.nextInt();
        			}
        		}
        		for(int k=m-1;k>0;k--) {
        			for(int i=0;i<k;i++) {
            			if(line[i][0]<line[i+1][0]) {
            				for(int j=0;j<3;j++) {
            				int temp = line[i][j];
            				line[i][j] = line[i+1][j];
            				line[i+1][j] = temp;
            				}
            			}
            		}
        		}
        		
        		for(int i=0;i<m;i++) {
        			if(a == line[i][1]) {
        				a = line[i][2];
        			}else if(a == line[i][2]) {
        				a = line[i][1];
        			}
        		}
        		System.out.println(a);
        	}
        }
    }
}
        		
