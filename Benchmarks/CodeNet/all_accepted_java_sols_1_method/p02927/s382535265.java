import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int M, D, D1=0, D10=0;
      	int cnt=0;
  		M =	sc.nextInt();
  		D =	sc.nextInt();
      	
      	for(int k=1; k<=M ;k++){
      	for (int i=22; i<=D; i++){
          	D1 = i % 10;
          	if (D1 == 1 || D1 == 0) continue;
      		D10 = i / 10;
          	if (k == D10 * D1){
              	cnt++;
            }
        }
        }
      	System.out.println(cnt); 	
	}
}