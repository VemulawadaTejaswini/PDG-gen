import static java.lang.System.*;

import java.util.Scanner;

class Main {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(); // 4
        int c = sc.nextInt(); // 5
        int sum,total = 0;
        int index[][] = new int[r + 1][c + 1];
        for(int a = 0; a < r; a++) {
        	sum = 0;
        	for(int b = 0; b < c; b++) {
        		int x = sc.nextInt();
        		index[a][b] = x;
        		sum += x;
        		if(b == c - 1) {
        			index[a][c] = sum;
        			sum = 0;
        		}
        	}
        } // c 5  r 4
        sum = 0;
        for(int a = 0; a < c; a++) {
        	for(int b = 0; b < r; b++) {
        		sum += index[b][a];
        		if(b == r - 1) {
        			index[b + 1][a] = sum;
        			total += sum;
        			sum = 0;
        		}
        	}
        }
        index[r][c] = total;
        for(int a = 0; a <= r; a++) {
        	for(int b = 0; b <= c; b++) {
        		if(b == c) {
        			out.println(index[a][b]);
        		}else {
        			out.print(index[a][b] + " ");
        		}
        	}
        }
    }
}
