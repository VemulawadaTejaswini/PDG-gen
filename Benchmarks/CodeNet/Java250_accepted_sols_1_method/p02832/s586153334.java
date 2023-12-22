import java.util.*;
import java.util.Scanner;
class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        Queue<Integer> queue = new ArrayDeque<>();
        for(int i=0; i<A; i++) {
        		int a = sc.nextInt();
        		queue.add(a);
        }
        int j = 1;
        for(int i=0; i<A; i++) {
        		int a = queue.poll();
        		if(a == j) {
        			j++;
        		}
        }
        if(j == 1) {
        		System.out.println(-1);
        } else {
        		System.out.println(A-j+1);
        }
    }
} 