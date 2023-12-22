import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int m500 = sc.nextInt();
        int m100 = sc.nextInt();
        int m50 = sc.nextInt();
      	int sum = sc.nextInt();
      	sc.close();
      	int count = 0;
      	for (int a=0; a<=m500; a++) {
        	for (int b=0; b<=m100; b++) {
              for (int c=0; c<=m50; c++) {
                if (500*a+100*b+50*c==sum) {
                  count++;
                }
              }
            }
        }
      	System.out.println(count);
	}
}