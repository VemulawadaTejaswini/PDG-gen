import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] c = new int[101];
        int m = 0;
        while(sc.hasNext()){
        	c[sc.nextInt()]++;
        }
        int max=0;
        for(int e: c){
        	if(e>max){
        		max = e;
        	}
        }
        for(int i=1;i<=100;i++){
        	if(c[i]==max){
        		System.out.println(i);
        	}
        }
    }
}