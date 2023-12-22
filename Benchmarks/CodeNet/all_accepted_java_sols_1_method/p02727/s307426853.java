import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
      	int Y = sc.nextInt();
      	int A = sc.nextInt();
      	int B = sc.nextInt();
     	int C = sc.nextInt();
        Long[] Aa = new Long[A];
      	for(int i = 0; i < A; i++){
        	Aa[i] = sc.nextLong();
        }
      	Long[] Ba = new Long[B];
      	for(int i = 0; i < B; i++){
        	Ba[i] = sc.nextLong();
        }
      	Long[] Ca = new Long[C];
      	for(int i = 0; i < C; i++){
        	Ca[i] = sc.nextLong();
        }
      	Arrays.sort(Aa, Collections.reverseOrder());
      	Arrays.sort(Ba, Collections.reverseOrder());
      	Arrays.sort(Ca, Collections.reverseOrder());
      
      	Long[] Sa = new Long[X+Y+C];
      	for(int i = 0; i < X; i++){
        	Sa[i] = Aa[i];
        }
      	for(int i = 0; i < Y; i++){
        	Sa[X+i] = Ba[i];
        }
      	for(int i = 0; i < C; i++){
        	Sa[X+Y+i] = Ca[i];
        }
      
      	Arrays.sort(Sa, Collections.reverseOrder());
      
		long sum = 0;
      	for(int i = 0; i < X+Y; i++){
        	sum += Sa[i];
        }

		System.out.println(sum);
	}
}